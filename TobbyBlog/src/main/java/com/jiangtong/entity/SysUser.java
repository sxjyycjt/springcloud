package com.jiangtong.entity;

import lombok.Data;

@Data
public class SysUser {

    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
