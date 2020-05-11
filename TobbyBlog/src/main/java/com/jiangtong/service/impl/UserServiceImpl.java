package com.jiangtong.service.impl;

import com.jiangtong.dao.UserMapper;
import com.jiangtong.entity.SysUser;
import com.jiangtong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<SysUser> getUserList() {
        return userMapper.getUserList();
    }
}
