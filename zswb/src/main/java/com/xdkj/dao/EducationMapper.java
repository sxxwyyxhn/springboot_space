package com.xdkj.dao;

import com.xdkj.bean.Education;
import org.apache.ibatis.annotations.Mapper;

/**
@author xh
@create 2020-06 16:13
*/
public interface EducationMapper {
    int deleteByPrimaryKey(Integer education_id);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer education_id);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}