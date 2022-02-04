package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author InRoota
 * @date 2022-01-30 14:28.
 * @description 学生表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student extends BaseVo implements Serializable {
    private String id ;
    private Integer userId;
    private Integer deptId;
    private Integer jobId;
    private String studentName;
    private Integer age;
    private Integer sex;
    private Long tel;
    private Date birthday;
    private String address;
    private String email;
    private String filedJson;

}
