package com.xdkj.service;

import com.xdkj.bean.JobInformation;
    /**
@author xh
@create 2020-06 16:13
*/
public interface JobInformationService{


    int deleteByPrimaryKey(Integer job_id);

    int insert(JobInformation record);

    int insertSelective(JobInformation record);

    JobInformation selectByPrimaryKey(Integer job_id);

    int updateByPrimaryKeySelective(JobInformation record);

    int updateByPrimaryKey(JobInformation record);

}
