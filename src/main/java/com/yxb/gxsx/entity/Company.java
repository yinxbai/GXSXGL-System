package com.yxb.gxsx.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公司表
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Company implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 唯一标识
     */
    private String id;

    private Integer userId;

    private String companyName;

    private Long tel;

    private String email;

    private String address;

    private String brief;

    private String legalPerson;

    private String website;

    private Integer status;

    private Integer auth;

    private String filedJson;


}
