package com.xdkj.service;

import com.xdkj.bean.Users;
    /**
@author xh
@create 2020-06 16:12
*/
public interface UsersService{


    int deleteByPrimaryKey(Integer user_id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);



}
