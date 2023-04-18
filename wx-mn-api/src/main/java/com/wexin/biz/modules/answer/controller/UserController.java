package com.wexin.biz.modules.answer.controller;

import com.wexin.biz.common.utils.Rt;
import com.wexin.biz.modules.answer.request.UserAuthRequest;
import com.wexin.biz.modules.answer.request.UserUpdateRequest;
import com.wexin.biz.modules.answer.response.UserLoginResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author cyber.pan
 * @Classname UserController
 * @Description
 * @Date 2023/4/18 23:35
 */
@RestController
@Api(tags = {"用户管理"})
@RequestMapping("user")
public class UserController {
    @PostMapping("/login/{appId}")
    @ApiOperation(value = "用户登陆")
    public Rt<UserLoginResponse> userLogin(@PathVariable("appId") String appId, @RequestBody UserAuthRequest request) {
        //上级分类id
        return Rt.ok(null);
    }

    @PostMapping("/updateUser")
    @ApiOperation(value = "用户用户修改")
    public Rt<Integer> userUpdate(@RequestBody UserUpdateRequest request) {
        //上级分类id
        return Rt.ok(null);
    }
}
