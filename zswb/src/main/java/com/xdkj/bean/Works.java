package com.xdkj.bean;

import java.io.Serializable;

/**
@author xh
@create 2020-06 16:12
*/
public class Works implements Serializable {
    /**
    * 作品编号
    */
    private Integer works_id;

    /**
    * 作品名称
    */
    private String works_name;

    /**
    * 所属行业
    */
    private String works_trade;

    /**
    * 关键词
    */
    private String works_keyword;

    /**
    * 作品链接
    */
    private String works_href;

    /**
    * 作品职责
    */
    private String works_duty;

    /**
    * 作品截图
    */
    private String works_image;

    /**
    * 所属人
    */
    private Integer works_person;

    private static final long serialVersionUID = 1L;

    public Integer getWorks_id() {
        return works_id;
    }

    public void setWorks_id(Integer works_id) {
        this.works_id = works_id;
    }

    public String getWorks_name() {
        return works_name;
    }

    public void setWorks_name(String works_name) {
        this.works_name = works_name;
    }

    public String getWorks_trade() {
        return works_trade;
    }

    public void setWorks_trade(String works_trade) {
        this.works_trade = works_trade;
    }

    public String getWorks_keyword() {
        return works_keyword;
    }

    public void setWorks_keyword(String works_keyword) {
        this.works_keyword = works_keyword;
    }

    public String getWorks_href() {
        return works_href;
    }

    public void setWorks_href(String works_href) {
        this.works_href = works_href;
    }

    public String getWorks_duty() {
        return works_duty;
    }

    public void setWorks_duty(String works_duty) {
        this.works_duty = works_duty;
    }

    public String getWorks_image() {
        return works_image;
    }

    public void setWorks_image(String works_image) {
        this.works_image = works_image;
    }

    public Integer getWorks_person() {
        return works_person;
    }

    public void setWorks_person(Integer works_person) {
        this.works_person = works_person;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", works_id=").append(works_id);
        sb.append(", works_name=").append(works_name);
        sb.append(", works_trade=").append(works_trade);
        sb.append(", works_keyword=").append(works_keyword);
        sb.append(", works_href=").append(works_href);
        sb.append(", works_duty=").append(works_duty);
        sb.append(", works_image=").append(works_image);
        sb.append(", works_person=").append(works_person);
        sb.append("]");
        return sb.toString();
    }
}