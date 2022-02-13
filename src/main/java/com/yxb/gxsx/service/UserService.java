package com.yxb.gxsx.service;

import com.yxb.gxsx.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 登录表  仅系统管理员可查看 服务类
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
public interface UserService extends IService<User> {

    public User getPwdByAccount(String account,String password);

}
