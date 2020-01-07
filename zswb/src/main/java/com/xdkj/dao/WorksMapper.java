package com.xdkj.dao;

import com.xdkj.bean.Works;
import org.apache.ibatis.annotations.Mapper;

/**
@author xh
@create 2020-06 16:12
*/
public interface WorksMapper {
    int deleteByPrimaryKey(Integer works_id);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer works_id);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}