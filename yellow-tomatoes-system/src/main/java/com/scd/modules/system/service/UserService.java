package com.scd.modules.system.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.scd.common.service.BaseService;
import com.scd.modules.system.domain.User;

import java.util.List;

public interface UserService extends BaseService<User> {

    public IPage<User> selectPageVo();

//    List<User> selectPageVo();
}
