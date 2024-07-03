package com.qiankun.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.qiankun.entity.User;
import com.qiankun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Date : 2024/07/02 14:46
 * @Auther : tiankun
 */
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public List<User> list(User user){
        return userService.list(Wrappers.query(user));
    }
}
