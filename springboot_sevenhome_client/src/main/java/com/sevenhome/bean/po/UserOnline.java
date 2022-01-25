package com.sevenhome.bean.po;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class UserOnline implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String useronlinePhone;

    private String useronlineAvatar;

    private BigDecimal useronlineTotalpay;

    private String useronlineSex;

    private String useronlineIdcard;

    private static final long serialVersionUID = 1L;


}