package com.tan.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author tan
 * @since 2020-09-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TbUser对象", description="用户表")
public class TbUser implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户名")
    private String username;

    private String nickname;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "状态 0锁定 1有效")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    @ApiModelProperty(value = "性别 0男 1女 2保密")
    private Integer sex;

    @ApiModelProperty(value = "盐")
    private String salt;

    @ApiModelProperty(value = "0:超级管理员，1：系统用户")
    private Integer type;

    @ApiModelProperty(value = "密码")
    private String password;

    private Date birth;

    @ApiModelProperty(value = "部门id")
    private Long departmentId;


}
