package com.xdkj.dao;

import com.xdkj.bean.Resume;
import org.apache.ibatis.annotations.Mapper;

/**
@author xh
@create 2020-06 16:12
*/
public interface ResumeMapper {
    int deleteByPrimaryKey(Integer resume_id);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer resume_id);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}