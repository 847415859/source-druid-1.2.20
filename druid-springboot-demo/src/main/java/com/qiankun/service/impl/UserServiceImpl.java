package com.qiankun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiankun.entity.User;
import com.qiankun.mapper.UserMapper;
import com.qiankun.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date : 2024/07/02 14:45
 * @Auther : tiankun
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
