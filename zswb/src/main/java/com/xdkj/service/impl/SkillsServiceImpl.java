package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.bean.Skills;
import com.xdkj.dao.SkillsMapper;
import com.xdkj.service.SkillsService;
/**
@author xh
@create 2020-06 16:12
*/
@Service
public class SkillsServiceImpl implements SkillsService{

    @Resource
    private SkillsMapper skillsMapper;

    @Override
    public int deleteByPrimaryKey(Integer skill_id) {
        return skillsMapper.deleteByPrimaryKey(skill_id);
    }

    @Override
    public int insert(Skills record) {
        return skillsMapper.insert(record);
    }

    @Override
    public int insertSelective(Skills record) {
        return skillsMapper.insertSelective(record);
    }

    @Override
    public Skills selectByPrimaryKey(Integer skill_id) {
        return skillsMapper.selectByPrimaryKey(skill_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Skills record) {
        return skillsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Skills record) {
        return skillsMapper.updateByPrimaryKey(record);
    }

}
