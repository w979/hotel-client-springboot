package com.sevenhome.bean.po;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class Employee implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String empname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String empImg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String empNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal empSalary;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String empStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer hotelId;

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
    public String getEmpname() {
        return empname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSex() {
        return sex;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUsername() {
        return username;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPassword() {
        return password;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmpImg() {
        return empImg;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmpImg(String empImg) {
        this.empImg = empImg == null ? null : empImg.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmpNumber() {
        return empNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber == null ? null : empNumber.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getEmpSalary() {
        return empSalary;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmpSalary(BigDecimal empSalary) {
        this.empSalary = empSalary;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmpStatus() {
        return empStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus == null ? null : empStatus.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHotelId() {
        return hotelId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }
}