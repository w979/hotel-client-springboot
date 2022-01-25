package com.sevenhome.bean.po;

import java.io.Serializable;
import javax.annotation.Generated;

public class VipType implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String viptypeName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String viptypeLevel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String viptypeDiscount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String viptypeStep;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getViptypeName() {
        return viptypeName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setViptypeName(String viptypeName) {
        this.viptypeName = viptypeName == null ? null : viptypeName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getViptypeLevel() {
        return viptypeLevel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setViptypeLevel(String viptypeLevel) {
        this.viptypeLevel = viptypeLevel == null ? null : viptypeLevel.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getViptypeDiscount() {
        return viptypeDiscount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setViptypeDiscount(String viptypeDiscount) {
        this.viptypeDiscount = viptypeDiscount == null ? null : viptypeDiscount.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getViptypeStep() {
        return viptypeStep;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setViptypeStep(String viptypeStep) {
        this.viptypeStep = viptypeStep == null ? null : viptypeStep.trim();
    }

    @Override
    public String toString() {
        return "VipType{" +
                "id=" + id +
                ", viptypeName='" + viptypeName + '\'' +
                ", viptypeLevel='" + viptypeLevel + '\'' +
                ", viptypeDiscount='" + viptypeDiscount + '\'' +
                ", viptypeStep='" + viptypeStep + '\'' +
                '}';
    }
}