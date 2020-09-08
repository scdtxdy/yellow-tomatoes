package com.scd;

import cn.hutool.core.lang.func.Func1;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
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

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void getUser() {
//        sysUserMapper.deleteAll();

//        User one = sysUserMapper.findOne(1l);
//        System.out.println(one);
        final Func1<IPage<User>, List<User>> selectPageVo = sysUserMapper::selectPageVo;
        System.out.println(selectPageVo);
//        List<User> userIPage = sysUserMapper.selectPageVo(new Page<User>(1, 2));
//        System.out.println(userIPage);

        // 使用pageHelper 的时候 自引用jsqlparser版本不兼容, net.sf.jsqlparser.statement.select.PlainSelect.getGroupByColumnReferences()
        // 故推荐使用mp自带分页插件
//        PageHelper.startPage(1, 1);
//        List<User> list = userService.list();
//
//        list.forEach((item) -> {
//            System.out.println(item.toString());
//        });

//        User user = new User();
//        user.setId(1l);
//        user.setNickName("test");
//        UpdateWrapper<User> userWapper = new UpdateWrapper<User>();
//        userWapper.eq(true, "id", 1l);
//        userService.update(user, userWapper);
//
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.clear();
//        queryWrapper.select("id");
//        String sqlSet = queryWrapper.getSqlSet();
//        System.out.println(sqlSet);
//        int count = userService.count();
//        System.out.println(count);

//        User user = new User();
//        user.setNickName("scd");
//        user.setEmail("542846492@qq.com");
//        user.setSex(SexEnum.MAN);
//
//        boolean save = userService.save(user);
//        System.out.println("scd = "+save);
    }

}
