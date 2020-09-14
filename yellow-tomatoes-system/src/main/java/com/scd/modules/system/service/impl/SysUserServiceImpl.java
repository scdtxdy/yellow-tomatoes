package com.scd.modules.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scd.common.service.impl.BaseServiceImpl;
import com.scd.dozer.service.IGenerator;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.DeptService;
import com.scd.modules.system.service.JobService;
import com.scd.modules.system.service.UserService;
import com.scd.modules.system.service.dto.UserDto;
import com.scd.modules.system.service.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "user")
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, User> implements UserService{

    @Autowired
    private IGenerator generator;

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private JobService jobService;

    @Autowired
    private DeptService deptService;

    @Cacheable
    @Override
    public IPage<User> selectPageVo() {
        IPage page = new Page<User>(1, 2);
        List<User> users = userMapper.selectPageVo(page);
        page.setRecords(users);
        return page;
    }


    /**
     * 根据用户名查询
     *
     * @param userName /
     * @return /
     */
    @Override
    public UserDto findByName(String userName) {
        User user =  userMapper.findByName(userName);
        //用户所属岗位
        user.setJob(jobService.getById(user.getJobId()));
        //用户所属部门
        user.setDept(deptService.getById(user.getDeptId()));
        return generator.convert(user,UserDto.class);
    }

}
