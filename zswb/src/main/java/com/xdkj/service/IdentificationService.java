package com.xdkj.service;

import com.xdkj.bean.Identification;
    /**
@author xh
@create 2020-06 16:13
*/
public interface IdentificationService{


    int deleteByPrimaryKey(Integer identity_id);

    int insert(Identification record);

    int insertSelective(Identification record);

    Identification selectByPrimaryKey(Integer identity_id);

    int updateByPrimaryKeySelective(Identification record);

    int updateByPrimaryKey(Identification record);

}
