package com.scd;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
import com.scd.modules.system.service.impl.SysUserServiceImpl;
import com.scd.modules.system.service.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class YellowTomatoesSystemApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    void getUser() {
//        List<User> list = userService.list();
//        list.forEach((item) -> {
//            System.out.println(item.toString());
//        });
        User user = new User();
        user.setId(1l);
        user.setNickName("test");
        UpdateWrapper<User> userWapper = new UpdateWrapper<User>();
        userWapper.eq(true, "id", 1l);
        userService.update(user, userWapper);
    }

}
