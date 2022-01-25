package com.sevenhome.bean.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class Orders implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String orderno;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer subscribeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer checkinId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal orderTotalprice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String orderStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date orderGeneratetime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer roomId;

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
    public String getOrderno() {
        return orderno;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSubscribeId() {
        return subscribeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubscribeId(Integer subscribeId) {
        this.subscribeId = subscribeId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCheckinId() {
        return checkinId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCheckinId(Integer checkinId) {
        this.checkinId = checkinId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getOrderTotalprice() {
        return orderTotalprice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderTotalprice(BigDecimal orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOrderStatus() {
        return orderStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getOrderGeneratetime() {
        return orderGeneratetime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderGeneratetime(Date orderGeneratetime) {
        this.orderGeneratetime = orderGeneratetime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRoomId() {
        return roomId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}