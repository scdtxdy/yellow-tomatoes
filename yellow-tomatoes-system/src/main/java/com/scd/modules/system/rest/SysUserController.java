package com.scd.modules.system.rest;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scd.annotation.AnonymousAccess;
import com.scd.modules.security.config.SecurityProperties;
import com.scd.modules.security.security.TokenProvider;
import com.scd.modules.security.security.vo.JwtUser;
import com.scd.modules.security.service.OnlineUserService;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "系统：用户管理")
@RestController
@RequestMapping("/api/users")
public class SysUserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManagerBuilder authenticationManagerBuilder;

    @Autowired
    private TokenProvider tokenProvider;

    @ApiOperation("导出用户数据")
//    @AnonymousAccess
    @GetMapping
    public IPage<User> selectPageVo(){
        return userService.selectPageVo();
    }

    @Autowired
    private SecurityProperties properties;

    @Autowired
    private OnlineUserService onlineUserService;


    @PostMapping("/login")
    @AnonymousAccess
    public String login(HttpServletRequest request){
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken("admin", "123456");
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        JwtUser jwtUser = (JwtUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String token = tokenProvider.createToken(authentication);
        System.out.println(token);
        String tokenStartWith = properties.getTokenStartWith();
        onlineUserService.save(jwtUser, token, request);
        return tokenStartWith + token;
    }

}
