package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.bean.Education;
import com.xdkj.dao.EducationMapper;
import com.xdkj.service.EducationService;
/**
@author xh
@create 2020-06 16:13
*/
@Service
public class EducationServiceImpl implements EducationService{

    @Resource
    private EducationMapper educationMapper;

    @Override
    public int deleteByPrimaryKey(Integer education_id) {
        return educationMapper.deleteByPrimaryKey(education_id);
    }

    @Override
    public int insert(Education record) {
        return educationMapper.insert(record);
    }

    @Override
    public int insertSelective(Education record) {
        return educationMapper.insertSelective(record);
    }

    @Override
    public Education selectByPrimaryKey(Integer education_id) {
        return educationMapper.selectByPrimaryKey(education_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Education record) {
        return educationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Education record) {
        return educationMapper.updateByPrimaryKey(record);
    }

}
