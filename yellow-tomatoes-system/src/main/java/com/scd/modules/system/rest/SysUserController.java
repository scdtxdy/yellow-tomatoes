package com.scd.modules.system.rest;

import com.scd.modules.system.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class SysUserController {

    private final UserService userService;

    public SysUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String hello(){
        return userService.getUserName();
    }
}
