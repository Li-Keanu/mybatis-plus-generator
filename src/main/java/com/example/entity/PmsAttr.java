package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品属性
 * </p>
 *
 * @author keanu
 * @since 2024-05-11 11:25:24
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("pms_attr")
@ApiModel(value = "PmsAttr对象", description = "商品属性")
public class PmsAttr implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("属性id")
    @TableId(value = "attr_id", type = IdType.AUTO)
    private Long attrId;

    @ApiModelProperty("属性名")
    @TableField("attr_name")
    private String attrName;

    @ApiModelProperty("是否需要检索[0-不需要，1-需要]")
    @TableField("search_type")
    private Byte searchType;

    @ApiModelProperty("值类型[0-为单个值，1-可以选择多个值]")
    @TableField("value_type")
    private Byte valueType;

    @ApiModelProperty("属性图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("可选值列表[用逗号分隔]")
    @TableField("value_select")
    private String valueSelect;

    @ApiModelProperty("属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]")
    @TableField("attr_type")
    private Byte attrType;

    @ApiModelProperty("启用状态[0 - 禁用，1 - 启用]")
    @TableField("enable")
    private Long enable;

    @ApiModelProperty("所属分类")
    @TableField("catelog_id")
    private Long catelogId;

    @ApiModelProperty("快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整")
    @TableField("show_desc")
    private Byte showDesc;
}
