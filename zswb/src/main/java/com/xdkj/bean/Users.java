package com.xdkj.bean;

import java.io.Serializable;

/**
@author xh
@create 2020-06 16:12
*/
public class Users implements Serializable {
    /**
    * 用户编号 自增，主键
    */
    private Integer user_id;

    /**
    * 用户昵称
    */
    private String user_name;

    /**
    * 用户邮箱 唯一
    */
    private String user_email;

    /**
    * 用户密码
    */
    private String user_password;

    /**
    * 0代表项目发布者，1代表项目接单者
    */
    private Integer user_role;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Integer getUser_role() {
        return user_role;
    }

    public void setUser_role(Integer user_role) {
        this.user_role = user_role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user_id=").append(user_id);
        sb.append(", user_name=").append(user_name);
        sb.append(", user_email=").append(user_email);
        sb.append(", user_password=").append(user_password);
        sb.append(", user_role=").append(user_role);
        sb.append("]");
        return sb.toString();
    }
}