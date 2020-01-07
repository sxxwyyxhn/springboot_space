package com.xdkj.service;

import com.xdkj.bean.Resume;
    /**
@author xh
@create 2020-06 16:12
*/
public interface ResumeService{


    int deleteByPrimaryKey(Integer resume_id);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer resume_id);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);

}
