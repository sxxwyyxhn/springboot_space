package com.xdkj.dao;

import com.xdkj.bean.Users;
import org.apache.ibatis.annotations.Mapper;

/**
@author xh
@create 2020-06 16:12
*/
public interface UsersMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}