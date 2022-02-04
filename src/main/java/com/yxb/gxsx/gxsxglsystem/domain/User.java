package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author YinXuBai
 * @date 2022/1/29
 * @description 用户表 ，所有账号
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class User extends BaseVo implements Serializable {

    private String id;
    private String account;         //账号
    private String passWord;        //密码

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
