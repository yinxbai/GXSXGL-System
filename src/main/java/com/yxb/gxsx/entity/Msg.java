package com.yxb.gxsx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 留言板
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Msg extends BaseEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 匿名
     */
    private String anonymous;

    /**
     * 内容
     */
    private String description;

    /**
     * 类型：1：公司意见；2：任务吐槽
     */
    private Integer type;

    /**
     * 点赞数
     */
    private Integer number;

    /**
     * 回复
     */
    private String reply;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
