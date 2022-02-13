package com.yxb.gxsx.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 考勤表
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Check extends BaseEntity implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    /**
     * 签到人
     */
    private Integer userId;

    /**
     * 上班时间
     */
    private LocalDateTime startTime;

    /**
     * 下班时间
     */
    private LocalDateTime endTime;

    /**
     * 0：迟到打卡；1：正常打卡；2：未打卡
     */
    private Integer type;

    /**
     * 打卡次数
     */
    private Integer amounts;

    /**
     * 总打卡次数
     */
    private Integer totals;


}
