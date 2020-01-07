package com.xdkj.dao;

import com.xdkj.bean.Skills;
import org.apache.ibatis.annotations.Mapper;

/**
@author xh
@create 2020-06 16:12
*/
public interface SkillsMapper {
    int deleteByPrimaryKey(Integer skill_id);

    int insert(Skills record);

    int insertSelective(Skills record);

    Skills selectByPrimaryKey(Integer skill_id);

    int updateByPrimaryKeySelective(Skills record);

    int updateByPrimaryKey(Skills record);
}