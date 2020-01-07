package com.xdkj.service;

import com.xdkj.bean.Education;
    /**
@author xh
@create 2020-06 16:13
*/
public interface EducationService{


    int deleteByPrimaryKey(Integer education_id);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer education_id);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);

}
