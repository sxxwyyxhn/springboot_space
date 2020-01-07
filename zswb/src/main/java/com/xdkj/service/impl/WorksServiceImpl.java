package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.bean.Works;
import com.xdkj.dao.WorksMapper;
import com.xdkj.service.WorksService;
/**
@author xh
@create 2020-06 16:12
*/
@Service
public class WorksServiceImpl implements WorksService{

    @Resource
    private WorksMapper worksMapper;

    @Override
    public int deleteByPrimaryKey(Integer works_id) {
        return worksMapper.deleteByPrimaryKey(works_id);
    }

    @Override
    public int insert(Works record) {
        return worksMapper.insert(record);
    }

    @Override
    public int insertSelective(Works record) {
        return worksMapper.insertSelective(record);
    }

    @Override
    public Works selectByPrimaryKey(Integer works_id) {
        return worksMapper.selectByPrimaryKey(works_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Works record) {
        return worksMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Works record) {
        return worksMapper.updateByPrimaryKey(record);
    }

}
