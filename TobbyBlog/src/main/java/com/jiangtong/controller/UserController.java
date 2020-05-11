package com.jiangtong.controller;

import com.github.pagehelper.PageHelper;
import com.jiangtong.entity.SysUser;
import com.jiangtong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @GetMapping("getUser/{id}")
    public SysUser getUserById(@PathVariable Integer id){
        return userServiceImpl.getUserById(id);
    }

    @GetMapping("getUser")
    public List<SysUser> getUserList(@RequestParam Integer num,@RequestParam Integer size){
        PageHelper.startPage(num,size);
        List<SysUser> userList = userServiceImpl.getUserList();
        return userList;
    }
}
