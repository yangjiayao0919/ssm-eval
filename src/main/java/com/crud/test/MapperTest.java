package com.crud.test;
import com.crud.bean.Eval;
import com.crud.dao.EvalMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    EvalMapper evalMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void test(){
       System.out.println(evalMapper);

        EvalMapper mapper = sqlSession.getMapper(EvalMapper.class);

        for(int i = 0;i<20;i++){
         //   mapper.insertSelective(new Eval(null, "北京",10, (long) 12,20,23, 23,46, 12,45,67,1,90,12,1,7));
        }
        System.out.println("批量完成");
    }
}
