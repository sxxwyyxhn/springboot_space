package com.xdkj.bean;

import java.io.Serializable;

/**
 * @author xh
 * @create 2020-07 11:14
 */
public class Project implements Serializable {
    /**
     * 项目编号
     */
    private Integer project_id;

    /**
     * 项目名称
     */
    private String project_name;

    /**
     * 项目预算
     */
    private Double project_budget;

    /**
     * 项目介绍
     */
    private String project_introduce;

    /**
     * 项目文档
     */
    private String project_file;

    /**
     * 项目发布者
     */
    private Integer project_publisher;

    private static final long serialVersionUID = 1L;

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Double getProject_budget() {
        return project_budget;
    }

    public void setProject_budget(Double project_budget) {
        this.project_budget = project_budget;
    }

    public String getProject_introduce() {
        return project_introduce;
    }

    public void setProject_introduce(String project_introduce) {
        this.project_introduce = project_introduce;
    }

    public String getProject_file() {
        return project_file;
    }

    public void setProject_file(String project_file) {
        this.project_file = project_file;
    }

    public Integer getProject_publisher() {
        return project_publisher;
    }

    public void setProject_publisher(Integer project_publisher) {
        this.project_publisher = project_publisher;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", project_id=").append(project_id);
        sb.append(", project_name=").append(project_name);
        sb.append(", project_budget=").append(project_budget);
        sb.append(", project_introduce=").append(project_introduce);
        sb.append(", project_file=").append(project_file);
        sb.append(", project_publisher=").append(project_publisher);
        sb.append("]");
        return sb.toString();
    }
}