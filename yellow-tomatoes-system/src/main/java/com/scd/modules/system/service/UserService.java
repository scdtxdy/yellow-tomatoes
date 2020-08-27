package com.scd.modules.system.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.scd.common.service.BaseService;
import com.scd.modules.system.domain.User;

public interface UserService extends BaseService<User> {

    public String getUserName();
}
