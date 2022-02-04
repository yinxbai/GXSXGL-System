package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author InRoota
 * @date 2022-01-31 15:11.
 * @description 部门表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dept extends BaseVo implements Serializable {

    private String id;
    private Integer deptId;
    private String deptName;

}
