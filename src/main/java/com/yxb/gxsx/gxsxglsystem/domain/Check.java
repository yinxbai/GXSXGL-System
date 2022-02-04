package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author InRoota
 * @date 2022-01-31 14:51.
 * @description 考勤表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Check implements Serializable {
    private String id;
    private Integer userId;
    private Date startTime;   //上班打卡
    private Date endTime;     //下班打卡
    private Integer type;     //打卡类型
    private Integer amounts;  //打卡次数 - 天
    private Integer totals;
}
