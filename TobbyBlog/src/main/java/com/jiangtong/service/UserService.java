package com.jiangtong.service;

import com.jiangtong.entity.SysUser;

import java.util.List;

public interface UserService {

    SysUser getUserById(Integer id);
    List<SysUser> getUserList();
}
