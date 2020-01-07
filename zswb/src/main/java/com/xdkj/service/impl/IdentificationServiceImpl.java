package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.dao.IdentificationMapper;
import com.xdkj.bean.Identification;
import com.xdkj.service.IdentificationService;
/**
@author xh
@create 2020-06 16:13
*/
@Service
public class IdentificationServiceImpl implements IdentificationService{

    @Resource
    private IdentificationMapper identificationMapper;

    @Override
    public int deleteByPrimaryKey(Integer identity_id) {
        return identificationMapper.deleteByPrimaryKey(identity_id);
    }

    @Override
    public int insert(Identification record) {
        return identificationMapper.insert(record);
    }

    @Override
    public int insertSelective(Identification record) {
        return identificationMapper.insertSelective(record);
    }

    @Override
    public Identification selectByPrimaryKey(Integer identity_id) {
        return identificationMapper.selectByPrimaryKey(identity_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Identification record) {
        return identificationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Identification record) {
        return identificationMapper.updateByPrimaryKey(record);
    }

}
