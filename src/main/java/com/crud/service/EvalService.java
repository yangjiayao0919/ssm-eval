package com.crud.service;

import com.crud.bean.Eval;
import com.crud.dao.EvalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvalService {


    @Autowired
    EvalMapper evalMapper;

    public List<Eval> getAll() {
        return evalMapper.selectAll();
    }

    public Integer getScore(Integer id) {
        return evalMapper.selectById(id);
    }

    public Integer insert(Eval eval){
        return evalMapper.insertSelective(eval);
    }

    public void delete(Integer id) {
        evalMapper.deleteByPrimaryKey(id);
    }

    public Eval getInfoById(Integer id) {
        return evalMapper.selectByPrimaryKey(id);
    }

    public void update(Eval eval) {
        evalMapper.updateByPrimaryKey(eval);
    }
}
