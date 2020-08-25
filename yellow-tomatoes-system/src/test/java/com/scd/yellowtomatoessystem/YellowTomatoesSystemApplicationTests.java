package com.scd.yellowtomatoessystem;

import com.scd.yellowtomatoessystem.modules.system.domain.User;
import com.scd.yellowtomatoessystem.modules.system.service.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YellowTomatoesSystemApplicationTests {

    @Autowired
    private SysUserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println(user.toString());
    }

}
