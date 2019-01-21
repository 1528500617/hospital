package com.ujiuye.zhuyuan.mapper;

import com.ujiuye.zhuyuan.bean.State;
import com.ujiuye.zhuyuan.bean.StateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StateMapper {
    int countByExample(StateExample example);

    int deleteByExample(StateExample example);

    int deleteByPrimaryKey(Integer stateid);

    int insert(State record);

    int insertSelective(State record);

    List<State> selectByExample(StateExample example);

    State selectByPrimaryKey(Integer stateid);

    int updateByExampleSelective(@Param("record") State record, @Param("example") StateExample example);

    int updateByExample(@Param("record") State record, @Param("example") StateExample example);

    int updateByPrimaryKeySelective(State record);

    int updateByPrimaryKey(State record);
}