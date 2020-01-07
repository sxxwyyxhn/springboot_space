package com.xdkj.bean;

import java.io.Serializable;

/**
@author xh
@create 2020-06 16:12
*/
public class Resume implements Serializable {
    /**
    * 简历编号
    */
    private Integer resume_id;

    /**
    * 工作状态
    */
    private String resume_workstatus;

    /**
    * 职业方向
    */
    private String resume_workdirection;

    /**
    * 具体工作
    */
    private String resume_specificwork;

    /**
    * 技能
    */
    private Integer resume_skill;

    /**
    * 个人作品
    */
    private Integer resume_works;

    /**
    * 个人介绍
    */
    private String resume_introduce;

    /**
    * 所属人
    */
    private Integer resume_person;

    private static final long serialVersionUID = 1L;

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public String getResume_workstatus() {
        return resume_workstatus;
    }

    public void setResume_workstatus(String resume_workstatus) {
        this.resume_workstatus = resume_workstatus;
    }

    public String getResume_workdirection() {
        return resume_workdirection;
    }

    public void setResume_workdirection(String resume_workdirection) {
        this.resume_workdirection = resume_workdirection;
    }

    public String getResume_specificwork() {
        return resume_specificwork;
    }

    public void setResume_specificwork(String resume_specificwork) {
        this.resume_specificwork = resume_specificwork;
    }

    public Integer getResume_skill() {
        return resume_skill;
    }

    public void setResume_skill(Integer resume_skill) {
        this.resume_skill = resume_skill;
    }

    public Integer getResume_works() {
        return resume_works;
    }

    public void setResume_works(Integer resume_works) {
        this.resume_works = resume_works;
    }

    public String getResume_introduce() {
        return resume_introduce;
    }

    public void setResume_introduce(String resume_introduce) {
        this.resume_introduce = resume_introduce;
    }

    public Integer getResume_person() {
        return resume_person;
    }

    public void setResume_person(Integer resume_person) {
        this.resume_person = resume_person;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resume_id=").append(resume_id);
        sb.append(", resume_workstatus=").append(resume_workstatus);
        sb.append(", resume_workdirection=").append(resume_workdirection);
        sb.append(", resume_specificwork=").append(resume_specificwork);
        sb.append(", resume_skill=").append(resume_skill);
        sb.append(", resume_works=").append(resume_works);
        sb.append(", resume_introduce=").append(resume_introduce);
        sb.append(", resume_person=").append(resume_person);
        sb.append("]");
        return sb.toString();
    }
}