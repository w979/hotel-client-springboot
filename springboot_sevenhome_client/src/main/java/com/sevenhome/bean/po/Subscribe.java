package com.sevenhome.bean.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class Subscribe implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String subscribeName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String subscribePhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date subscribeIntime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date subscribeLeavetime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer subscribeOrigin;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal subscribeDeposit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal subscribeRoomrate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer vipId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer roomtypeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer employeeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer subscribePaytype;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer subscribeStatus;

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
    public String getSubscribeName() {
        return subscribeName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeName(String subscribeName) {
        this.subscribeName = subscribeName == null ? null : subscribeName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSubscribePhone() {
        return subscribePhone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribePhone(String subscribePhone) {
        this.subscribePhone = subscribePhone == null ? null : subscribePhone.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getSubscribeIntime() {
        return subscribeIntime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeIntime(Date subscribeIntime) {
        this.subscribeIntime = subscribeIntime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getSubscribeLeavetime() {
        return subscribeLeavetime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeLeavetime(Date subscribeLeavetime) {
        this.subscribeLeavetime = subscribeLeavetime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSubscribeOrigin() {
        return subscribeOrigin;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeOrigin(Integer subscribeOrigin) {
        this.subscribeOrigin = subscribeOrigin;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getSubscribeDeposit() {
        return subscribeDeposit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeDeposit(BigDecimal subscribeDeposit) {
        this.subscribeDeposit = subscribeDeposit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getSubscribeRoomrate() {
        return subscribeRoomrate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeRoomrate(BigDecimal subscribeRoomrate) {
        this.subscribeRoomrate = subscribeRoomrate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getVipId() {
        return vipId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRoomtypeId() {
        return roomtypeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomtypeId(Integer roomtypeId) {
        this.roomtypeId = roomtypeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getEmployeeId() {
        return employeeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSubscribePaytype() {
        return subscribePaytype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribePaytype(Integer subscribePaytype) {
        this.subscribePaytype = subscribePaytype;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSubscribeStatus() {
        return subscribeStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeStatus(Integer subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }
}