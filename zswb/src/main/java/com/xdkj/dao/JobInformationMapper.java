package com.xdkj.dao;

import com.xdkj.bean.JobInformation;
import org.apache.ibatis.annotations.Mapper;

/**
@author xh
@create 2020-06 16:13
*/
public interface JobInformationMapper {
    int deleteByPrimaryKey(Integer job_id);

    int insert(JobInformation record);

    int insertSelective(JobInformation record);

    JobInformation selectByPrimaryKey(Integer job_id);

    int updateByPrimaryKeySelective(JobInformation record);

    int updateByPrimaryKey(JobInformation record);
}