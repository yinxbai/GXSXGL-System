package com.yxb.gxsx.entity;

import java.time.LocalDate;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学生表
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseEntity implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 唯一标识
     */
    private String id;

    private Integer userId;

    private Integer deptId;

    private Integer jobId;

    private String studentName;

    private Integer age;

    private Integer sex;

    private Long tel;

    private LocalDate birthday;

    private String address;

    private String email;

    private Integer status;

    private Integer auth;

    /**
     * 全部信息
     */
    private String filedJson;


}
