package com.yxb.gxsx.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Dept extends BaseEntity implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private Integer deptId;

    private String deptName;


}
