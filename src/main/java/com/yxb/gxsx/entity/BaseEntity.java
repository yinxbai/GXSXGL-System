package com.yxb.gxsx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author YinXuBai
 * @date 2022-02-12 10:55.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseEntity {
    private String createBy;        //创建人
    private String createDate;      //创建时间
    private String updateBy;        //修改人
    private String updateDate;      //修改时间
    private Integer status;          //状态 0：未申请；1：使用中；2已删除
    private String remark;          //备注
    private Integer auth;            //权限控制 0：学生；1：高校；2：企业；3：管理员
}
