package com.scd;

import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class YellowTomatoesSystemApplicationTests {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void getUser() {
        User user = sysUserMapper.selectById(1);
        System.out.println(user.toString());
    }

}
