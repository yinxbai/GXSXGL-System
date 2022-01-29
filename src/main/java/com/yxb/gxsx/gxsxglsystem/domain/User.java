package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author YinXuBai
 * @date 2022/1/29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseVo implements Serializable {

    private String id;
    private String account;         //账号
    private String passWord;        //密码

}
