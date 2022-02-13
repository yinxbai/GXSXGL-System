package com.yxb.gxsx.mapper;

import com.yxb.gxsx.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 登录表  仅系统管理员可查看 Mapper 接口
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
public interface UserMapper extends BaseMapper<User> {

    public User getPwdByAccount(String account,String password);


}
