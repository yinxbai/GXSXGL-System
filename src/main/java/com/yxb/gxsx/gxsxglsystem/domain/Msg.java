package com.yxb.gxsx.gxsxglsystem.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author InRoota
 * @date 2022-01-31 14:57.
 * @description 留言板
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Msg extends BaseVo implements Serializable {

    private String id;
    private String anonymous;   //匿名
    private String description; //内容
    private Integer type;       //类型
    private Integer number;
    private String reply;

}
