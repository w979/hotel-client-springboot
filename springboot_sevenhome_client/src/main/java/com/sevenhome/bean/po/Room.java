package com.sevenhome.bean.po;

import java.io.Serializable;
import javax.annotation.Generated;

public class Room implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rommno;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer roomtypeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String roomFloor;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String roomStatus;

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
    public String getRommno() {
        return rommno;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRommno(String rommno) {
        this.rommno = rommno == null ? null : rommno.trim();
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
    public String getRoomFloor() {
        return roomFloor;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomFloor(String roomFloor) {
        this.roomFloor = roomFloor == null ? null : roomFloor.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRoomStatus() {
        return roomStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus == null ? null : roomStatus.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHotelId() {
        return hotelId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", rommno='" + rommno + '\'' +
                ", roomtypeId=" + roomtypeId +
                ", roomFloor='" + roomFloor + '\'' +
                ", roomStatus='" + roomStatus + '\'' +
                ", hotelId=" + hotelId +
                '}';
    }
}