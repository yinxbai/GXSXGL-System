package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author InRoota
 * @date 2022-01-31 15:03.
 * @description 请假表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Leave extends BaseVo implements Serializable {
    private String id;
    private Integer deptId;
    private Integer type;
    private Date startTime;
    private Date endTime;
    private Double duration; //请假时长 自动计算  填充
    private String reason;
    private String explain;

}
