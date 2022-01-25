package com.sevenhome.bean.po;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class RoomStatus implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer roomId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer roomstatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date roomstatusDate;

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
    public Integer getRoomId() {
        return roomId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRoomstatus() {
        return roomstatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomstatus(Integer roomstatus) {
        this.roomstatus = roomstatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getRoomstatusDate() {
        return roomstatusDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomstatusDate(Date roomstatusDate) {
        this.roomstatusDate = roomstatusDate;
    }
}