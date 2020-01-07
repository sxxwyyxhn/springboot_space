package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.bean.Resume;
import com.xdkj.dao.ResumeMapper;
import com.xdkj.service.ResumeService;
/**
@author xh
@create 2020-06 16:12
*/
@Service
public class ResumeServiceImpl implements ResumeService{

    @Resource
    private ResumeMapper resumeMapper;

    @Override
    public int deleteByPrimaryKey(Integer resume_id) {
        return resumeMapper.deleteByPrimaryKey(resume_id);
    }

    @Override
    public int insert(Resume record) {
        return resumeMapper.insert(record);
    }

    @Override
    public int insertSelective(Resume record) {
        return resumeMapper.insertSelective(record);
    }

    @Override
    public Resume selectByPrimaryKey(Integer resume_id) {
        return resumeMapper.selectByPrimaryKey(resume_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Resume record) {
        return resumeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Resume record) {
        return resumeMapper.updateByPrimaryKey(record);
    }

}
