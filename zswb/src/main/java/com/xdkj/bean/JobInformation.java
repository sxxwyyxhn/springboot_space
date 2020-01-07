package com.xdkj.bean;

import java.io.Serializable;
import java.util.Date;

/**
@author xh
@create 2020-06 16:13
*/
public class JobInformation implements Serializable {
    /**
    * 工作信息编号
    */
    private Integer job_id;

    /**
    * 工作日时间
    */
    private Date job_time;

    /**
    * 非工作日时间
    */
    private Date job_untime;

    /**
    * 可工作地址
    */
    private String job_address;

    /**
    * 周工作时长
    */
    private Integer job_hours;

    /**
    * 日薪
    */
    private Double job_daysal;

    /**
    * 工作形式
    */
    private String job_pattern;

    /**
    * 所属人
    */
    private Integer job_person;

    private static final long serialVersionUID = 1L;

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Date getJob_time() {
        return job_time;
    }

    public void setJob_time(Date job_time) {
        this.job_time = job_time;
    }

    public Date getJob_untime() {
        return job_untime;
    }

    public void setJob_untime(Date job_untime) {
        this.job_untime = job_untime;
    }

    public String getJob_address() {
        return job_address;
    }

    public void setJob_address(String job_address) {
        this.job_address = job_address;
    }

    public Integer getJob_hours() {
        return job_hours;
    }

    public void setJob_hours(Integer job_hours) {
        this.job_hours = job_hours;
    }

    public Double getJob_daysal() {
        return job_daysal;
    }

    public void setJob_daysal(Double job_daysal) {
        this.job_daysal = job_daysal;
    }

    public String getJob_pattern() {
        return job_pattern;
    }

    public void setJob_pattern(String job_pattern) {
        this.job_pattern = job_pattern;
    }

    public Integer getJob_person() {
        return job_person;
    }

    public void setJob_person(Integer job_person) {
        this.job_person = job_person;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", job_id=").append(job_id);
        sb.append(", job_time=").append(job_time);
        sb.append(", job_untime=").append(job_untime);
        sb.append(", job_address=").append(job_address);
        sb.append(", job_hours=").append(job_hours);
        sb.append(", job_daysal=").append(job_daysal);
        sb.append(", job_pattern=").append(job_pattern);
        sb.append(", job_person=").append(job_person);
        sb.append("]");
        return sb.toString();
    }
}