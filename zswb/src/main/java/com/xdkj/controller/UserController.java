package com.xdkj.controller;

import com.xdkj.bean.Users;
import com.xdkj.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.Servlet;

/**
 * @author xh
 * @create 2020-06 17:11
 */
@RestController
@RequestMapping("/user")
@Api(value = "登录接口",tags = "区分身份登录")
public class UserController {

    @Autowired
    private UsersService us;

    @ApiOperation(value = "查询所有",notes = "这是查询所有的方法")
    @ApiResponses({@ApiResponse(code = 1,message = "success"),@ApiResponse(code = 2,message = "fail")})
    @GetMapping("login")
    @ResponseBody
    public String login(){

        Users users = us.selectByPrimaryKey(1001);
        System.out.println(users);

        return "hello";
    }
}
