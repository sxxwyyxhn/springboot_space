package com.xdkj.service;

import com.xdkj.bean.Works;
    /**
@author xh
@create 2020-06 16:12
*/
public interface WorksService{


    int deleteByPrimaryKey(Integer works_id);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer works_id);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);

}
