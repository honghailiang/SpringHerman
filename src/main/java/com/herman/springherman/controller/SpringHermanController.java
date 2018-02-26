package com.herman.springherman.controller;

import com.herman.springherman.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "user相关api")
@RestController
@RequestMapping("/springherman")
public class SpringHermanController {

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return "hello, this is my first spring boot program!!!";
    }

    @ApiOperation("根据ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",dataType = "int",required = true,
                    value = "用户的id",defaultValue = "1")})
    @ApiResponses({
            @ApiResponse(code = 400,message = "请求参数没填好"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public User getUserInfo(@RequestParam("id") int id) {
        return  new User(id,"Herman","123456");
    }
}
