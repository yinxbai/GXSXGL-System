package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author InRoota
 * @date 2022-01-31 15:01.
 * @description 工作表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Job extends BaseVo implements Serializable {

    private String id;
    private Integer deptId;
    private Integer jobId;
    private String jobName;

}
