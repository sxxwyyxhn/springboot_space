package com.xdkj.dao;

import com.xdkj.bean.Project;

/**
@author xh
@create 2020-07 11:14
*/
public interface ProjectMapper {
    int deleteByPrimaryKey(Integer project_id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer project_id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}