package com.xdkj.bean;

import java.io.Serializable;

/**
@author xh
@create 2020-06 16:12
*/
public class Skills implements Serializable {
    /**
    * 技能编号
    */
    private Integer skill_id;

    /**
    * 经验自评
    */
    private String skill_evaluate;

    /**
    * 所属人
    */
    private Integer skill_person;

    private static final long serialVersionUID = 1L;

    public Integer getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(Integer skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_evaluate() {
        return skill_evaluate;
    }

    public void setSkill_evaluate(String skill_evaluate) {
        this.skill_evaluate = skill_evaluate;
    }

    public Integer getSkill_person() {
        return skill_person;
    }

    public void setSkill_person(Integer skill_person) {
        this.skill_person = skill_person;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skill_id=").append(skill_id);
        sb.append(", skill_evaluate=").append(skill_evaluate);
        sb.append(", skill_person=").append(skill_person);
        sb.append("]");
        return sb.toString();
    }
}