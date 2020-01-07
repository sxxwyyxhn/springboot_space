package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.bean.Users;
import com.xdkj.dao.UsersMapper;
import com.xdkj.service.UsersService;
/**
@author xh
@create 2020-06 16:12
*/
@Service
public class UsersServiceImpl implements UsersService{

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer user_id) {
        return usersMapper.deleteByPrimaryKey(user_id);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer user_id) {
        return usersMapper.selectByPrimaryKey(user_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

}
