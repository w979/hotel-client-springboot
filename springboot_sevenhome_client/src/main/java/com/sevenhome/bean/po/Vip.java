package com.sevenhome.bean.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
@Data
public class Vip implements Serializable {
    private Integer id;
    private String vipNo;

    private String vipStatus;
    private String vipRemark;

    private Integer viptypeId;

    private Date vipStarttime;

    private Date vipEndtime;


    private Integer useronlineId;

    private VipType vipType;

    private static final long serialVersionUID = 1L;

    @Override
    public String
    toString() {
        return "Vip{" +
                "id=" + id +
                ", vipNo='" + vipNo + '\'' +
                ", vipStatus='" + vipStatus + '\'' +
                ", vipRemark='" + vipRemark + '\'' +
                ", viptypeId=" + viptypeId +
                ", vipStarttime=" + vipStarttime +
                ", vipEndtime=" + vipEndtime +
                ", useronlineId=" + useronlineId +
                ", vipType=" + vipType +
                '}';
    }
}