package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private String id;
    private String code;
    private String name;
    private String sex;
    private String mobile;
    private String orgId;
    private String remark;
}
