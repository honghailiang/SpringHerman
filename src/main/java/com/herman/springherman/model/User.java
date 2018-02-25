package com.herman.springherman.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@ApiModel("用户模型")
@AllArgsConstructor
@Data
public class User {
    @ApiModelProperty("用户ID")
    private int id;
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户密码")
    private String password;
}
