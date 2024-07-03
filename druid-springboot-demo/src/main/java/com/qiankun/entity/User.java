package com.qiankun.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Date : 2024/07/02 14:40
 * @Auther : tiankun
 */
@Data
@TableName("user")
public class User {
    private Integer id;
    private String userName;
    private Integer age;
    private Date createTime;
}
