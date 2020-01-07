package com.xdkj.bean;

import java.io.Serializable;

/**
@author xh
@create 2020-06 16:13
*/
public class Identification implements Serializable {
    /**
    * 认证编号
    */
    private Integer identity_id;

    /**
    * 身份证号
    */
    private String identity_card;

    /**
    * 身份证正反面
    */
    private String identity_image;

    /**
    * 认证状态
    */
    private Integer identity_status;

    /**
    * 所属人
    */
    private Integer identity_person;

    private static final long serialVersionUID = 1L;

    public Integer getIdentity_id() {
        return identity_id;
    }

    public void setIdentity_id(Integer identity_id) {
        this.identity_id = identity_id;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getIdentity_image() {
        return identity_image;
    }

    public void setIdentity_image(String identity_image) {
        this.identity_image = identity_image;
    }

    public Integer getIdentity_status() {
        return identity_status;
    }

    public void setIdentity_status(Integer identity_status) {
        this.identity_status = identity_status;
    }

    public Integer getIdentity_person() {
        return identity_person;
    }

    public void setIdentity_person(Integer identity_person) {
        this.identity_person = identity_person;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", identity_id=").append(identity_id);
        sb.append(", identity_card=").append(identity_card);
        sb.append(", identity_image=").append(identity_image);
        sb.append(", identity_status=").append(identity_status);
        sb.append(", identity_person=").append(identity_person);
        sb.append("]");
        return sb.toString();
    }
}