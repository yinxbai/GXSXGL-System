package com.yxb.gxsx.gxsxglsystem.service;

import com.yxb.gxsx.gxsxglsystem.domain.User;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author InRoota
 * @date 2022-02-04 18:20.
 */
@Service
public interface UserService {

//    public User getPwdByUsername(Map<String,String> params);

    public User getPwdByUsername(String userName);
}
