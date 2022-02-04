package com.yxb.gxsx.gxsxglsystem.service.imp;

import com.yxb.gxsx.gxsxglsystem.domain.User;
import com.yxb.gxsx.gxsxglsystem.mapper.UserMapper;
import com.yxb.gxsx.gxsxglsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author InRoota
 * @date 2022-02-04 18:35.
 */
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getPwdByUsername(String userName) {
        return userMapper.getPwdByUsername(userName);
    }
}
