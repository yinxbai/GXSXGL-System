package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author InRoota
 * @date 2022-01-31 14:43.
 * @description 公司表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Company extends BaseVo implements Serializable {

    private String id;
    private Integer userId;
    private String companyName;
    private Long tel;
    private String email;
    private String address;
    private String brief;        //公司简介
    private String legalPerson;  //法人
    private String website;      //网址
    private String filedJson;    //其他信息
}
