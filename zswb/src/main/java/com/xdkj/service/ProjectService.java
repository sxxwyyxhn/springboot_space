package com.xdkj.service;

import com.xdkj.bean.Project;

/**
 * @author xh
 * @create 2020-06 16:13
 */
public interface ProjectService {


    int deleteByPrimaryKey(Integer project_id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer project_id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

}

