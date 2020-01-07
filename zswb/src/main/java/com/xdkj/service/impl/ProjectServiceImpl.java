package com.xdkj.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xdkj.dao.ProjectMapper;
import com.xdkj.bean.Project;
import com.xdkj.service.ProjectService;

/**
 * @author xh
 * @create 2020-06 16:13
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public int deleteByPrimaryKey(Integer project_id) {
        return projectMapper.deleteByPrimaryKey(project_id);
    }

    @Override
    public int insert(Project record) {
        return projectMapper.insert(record);
    }

    @Override
    public int insertSelective(Project record) {
        return projectMapper.insertSelective(record);
    }

    @Override
    public Project selectByPrimaryKey(Integer project_id) {
        return projectMapper.selectByPrimaryKey(project_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Project record) {
        return projectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Project record) {
        return projectMapper.updateByPrimaryKey(record);
    }

}

