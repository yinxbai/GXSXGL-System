package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author InRoota
 * @date 2022-01-31 14:38.
 * @description 老师表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher extends BaseVo implements Serializable {
    private String id;
    private Integer userId;
    private String teacherName;
    private Integer age;
    private Integer sex;
    private Long tel;
    private Date birthday;
    private String address;
    private String position;
    private String email;
    private String filedJson;
}
