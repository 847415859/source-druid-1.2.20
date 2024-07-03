package com.qiankun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiankun.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Date : 2024/07/02 14:39
 * @Auther : tiankun
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
