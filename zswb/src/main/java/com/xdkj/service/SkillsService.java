package com.xdkj.service;

import com.xdkj.bean.Skills;
    /**
@author xh
@create 2020-06 16:12
*/
public interface SkillsService{


    int deleteByPrimaryKey(Integer skill_id);

    int insert(Skills record);

    int insertSelective(Skills record);

    Skills selectByPrimaryKey(Integer skill_id);

    int updateByPrimaryKeySelective(Skills record);

    int updateByPrimaryKey(Skills record);

}
