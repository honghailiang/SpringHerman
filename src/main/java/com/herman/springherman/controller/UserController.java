package com.herman.springherman.controller;

import com.herman.springherman.model.HermanUser;
import com.herman.springherman.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2018/11/18 15:46
 */
@Api(description = "user相关api")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("根据ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",dataType = "int",required = true,
                    value = "用户的id",defaultValue = "1")})
    @ApiResponses({
            @ApiResponse(code = 401,message = "权限校验不通过")
    })
    @RequestMapping(value = "/getHermanUser", method = RequestMethod.GET)
    public HermanUser getHermanUser(@RequestParam("id") long id) {
        return userService.getUser(id);
    }
}
