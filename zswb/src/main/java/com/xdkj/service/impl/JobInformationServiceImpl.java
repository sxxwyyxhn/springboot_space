package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.dao.JobInformationMapper;
import com.xdkj.bean.JobInformation;
import com.xdkj.service.JobInformationService;
/**
@author xh
@create 2020-06 16:13
*/
@Service
public class JobInformationServiceImpl implements JobInformationService{

    @Resource
    private JobInformationMapper jobInformationMapper;

    @Override
    public int deleteByPrimaryKey(Integer job_id) {
        return jobInformationMapper.deleteByPrimaryKey(job_id);
    }

    @Override
    public int insert(JobInformation record) {
        return jobInformationMapper.insert(record);
    }

    @Override
    public int insertSelective(JobInformation record) {
        return jobInformationMapper.insertSelective(record);
    }

    @Override
    public JobInformation selectByPrimaryKey(Integer job_id) {
        return jobInformationMapper.selectByPrimaryKey(job_id);
    }

    @Override
    public int updateByPrimaryKeySelective(JobInformation record) {
        return jobInformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JobInformation record) {
        return jobInformationMapper.updateByPrimaryKey(record);
    }

}
