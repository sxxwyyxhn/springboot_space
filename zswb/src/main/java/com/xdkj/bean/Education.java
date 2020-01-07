package com.xdkj.bean;

import java.io.Serializable;
import java.util.Date;

/**
@author xh
@create 2020-06 16:13
*/
public class Education implements Serializable {
    /**
    * 编号
    */
    private Integer education_id;

    /**
    * 开始时间
    */
    private Date education_start;

    /**
    * 结束时间
    */
    private Date education_end;

    /**
    * 学校名称
    */
    private String school_name;

    /**
    * 专业
    */
    private String profession;

    /**
    * 学历层次
    */
    private String education_level;

    /**
    * 所属人
    */
    private Integer education_person;

    private static final long serialVersionUID = 1L;

    public Integer getEducation_id() {
        return education_id;
    }

    public void setEducation_id(Integer education_id) {
        this.education_id = education_id;
    }

    public Date getEducation_start() {
        return education_start;
    }

    public void setEducation_start(Date education_start) {
        this.education_start = education_start;
    }

    public Date getEducation_end() {
        return education_end;
    }

    public void setEducation_end(Date education_end) {
        this.education_end = education_end;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public Integer getEducation_person() {
        return education_person;
    }

    public void setEducation_person(Integer education_person) {
        this.education_person = education_person;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", education_id=").append(education_id);
        sb.append(", education_start=").append(education_start);
        sb.append(", education_end=").append(education_end);
        sb.append(", school_name=").append(school_name);
        sb.append(", profession=").append(profession);
        sb.append(", education_level=").append(education_level);
        sb.append(", education_person=").append(education_person);
        sb.append("]");
        return sb.toString();
    }
}