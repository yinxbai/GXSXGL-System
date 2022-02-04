package com.yxb.gxsx.gxsxglsystem.mapper;

import com.yxb.gxsx.gxsxglsystem.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author InRoota
 * @date 2022-02-04 18:35.
 */
@Mapper
public interface  UserMapper {

    public User getPwdByUsername(String userName);
}
