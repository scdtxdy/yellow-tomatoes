package com.scd.modules.system.rest;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "系统：用户管理")
@RestController
@RequestMapping("/api/users")
public class SysUserController {

    private final UserService userService;

    public SysUserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("导出用户数据")
    @GetMapping
    public IPage<User> selectPageVo(){
        return userService.selectPageVo();
    }

}
