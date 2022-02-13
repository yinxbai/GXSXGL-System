package com.yxb.gxsx.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 请假表
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Leave extends BaseEntity implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String deptId;

    private Integer type;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    /**
     * 时长
     */
    private Double duration;

    /**
     * 理由
     */
    private String reason;

    /**
     * 说明
     */
    private String explain;

    /**
     * 状态 0：未提交；1：已提交；2：申请中；3：审核成功；4：未通过
     */
    private Integer status;


}
