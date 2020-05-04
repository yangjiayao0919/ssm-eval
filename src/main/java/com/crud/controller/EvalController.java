package com.crud.controller;

import com.crud.bean.Eval;
import com.crud.bean.Msg;
import com.crud.service.EvalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.List;

@Controller
public class EvalController {

    @Autowired
    EvalService evalService;

    /**
     * 访问首页
     * @return
     */
    @RequestMapping("/eval")
    public String index(){
        return "index";
    }

    /**
     * 获取列表
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String getEval(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model){

        PageHelper.startPage(pn, 8);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<Eval> evals = evalService.getAll();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(evals, 3);
        model.addAttribute("pageInfo", page);
        return "list";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    /**
     * 新增保存
     * @param eval
     * @return
     */
    @ResponseBody
    @RequestMapping(value ="/saveEval",method = RequestMethod.GET)
    public Integer saveEval(Eval eval){
        long sum = Math.round(eval.getSpaceNum()*100/100.0/100*10)+
                Math.round(eval.getGdp()*100/100.0/40000*10)+
                Math.round(eval.getCompanyNum()*100/100.0/200*10)+
                Math.round(eval.getSuperCompanyNum()*100/100.0/100*10)+
                Math.round(eval.getSchoolNum()*100/100.0/100*10)+
                Math.round(eval.getPeopleNum()*100/100.0/50*10)+
                Math.round(eval.getFever())+
                Math.round(eval.getSupport())+
                Math.round(eval.getFacilities()*100/100.0/600*10)+
                Math.round(eval.getArea()*100/100.0/200*10);
        eval.setScore((int) sum);
        evalService.insert(eval);
        return eval.getId();
    }


    /**
     * 更新后保存
     * @param eval
     * @return
     */
    @ResponseBody
    @RequestMapping(value ="/saveEditEval",method = RequestMethod.GET)
    public Integer saveEditEval(Eval eval){
        long sum = Math.round(eval.getSpaceNum()*100/100.0/100*10)+
                Math.round(eval.getGdp()*100/100.0/40000*10)+
                Math.round(eval.getCompanyNum()*100/100.0/200*10)+
                Math.round(eval.getSuperCompanyNum()*100/100.0/100*10)+
                Math.round(eval.getSchoolNum()*100/100.0/100*10)+
                Math.round(eval.getPeopleNum()*100/100.0/50*10)+
                Math.round(eval.getFever())+
                Math.round(eval.getSupport())+
                Math.round(eval.getFacilities()*100/100.0/600*10)+
                Math.round(eval.getArea()*100/100.0/200*10);

        eval.setScore((int) sum);
        evalService.update(eval);
        return eval.getId();
    }

    /**
     * 跳转到更新页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="/edit",method=RequestMethod.GET)
    public String editEmp(@RequestParam("id")Integer id,Model model){
        Eval eval = evalService.getInfoById(id);
        model.addAttribute("eval",eval);
        return "edit";
    }

    /**
     * 跳转到查看分数页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="/view",method=RequestMethod.GET)
    public String viewScore(@RequestParam("score")Integer id,Model model){
        Integer score = evalService.getScore(id);
        model.addAttribute("score",score);
        return "score";
    }

    /**
     * 删除方法
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/delete",method=RequestMethod.GET)
    public Msg deleteEmp(@RequestParam("id")Integer id){
        evalService.delete(id);
        return Msg.success();
    }

}
