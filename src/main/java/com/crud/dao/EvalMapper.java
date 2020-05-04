package com.crud.dao;

import com.crud.bean.Eval;
import com.crud.bean.EvalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvalMapper {
    long countByExample(EvalExample example);

    int deleteByExample(EvalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Eval record);

    int insertSelective(Eval record);

    List<Eval> selectByExample(EvalExample example);

    Eval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Eval record, @Param("example") EvalExample example);

    int updateByExample(@Param("record") Eval record, @Param("example") EvalExample example);

    int updateByPrimaryKeySelective(Eval record);

    int updateByPrimaryKey(Eval record);

    List<Eval> selectAll();

    Integer selectById(Integer id);

}