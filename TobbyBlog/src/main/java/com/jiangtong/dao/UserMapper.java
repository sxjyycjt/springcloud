package com.jiangtong.dao;


import com.jiangtong.entity.SysUser;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {

    SysUser getUserById(Integer id);
    List<SysUser> getUserList();
}
