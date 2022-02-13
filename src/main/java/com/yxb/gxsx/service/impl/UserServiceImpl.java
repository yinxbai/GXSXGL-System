package com.yxb.gxsx.service.impl;

import com.yxb.gxsx.entity.User;
import com.yxb.gxsx.mapper.UserMapper;
import com.yxb.gxsx.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录表  仅系统管理员可查看 服务实现类
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getPwdByAccount(String account, String password) {
        return userMapper.getPwdByAccount(account,password);
    }
}
