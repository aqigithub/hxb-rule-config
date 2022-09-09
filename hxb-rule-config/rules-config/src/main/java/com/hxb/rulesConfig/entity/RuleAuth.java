package com.hxb.rulesConfig.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 新的远程授权业务-授权规则表
 * </p>
 *
 * @author 赵长红
 * @since 2022-09-09 09：09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("RULE_AUTH")
@ApiModel(value="RuleAuth对象", description="新的远程授权业务-授权规则表")
public class RuleAuth implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键ID")
      @TableId("AUTH_ID")
    private String authId;

    @ApiModelProperty(value = "交易码")
    @TableField("BUSI_DODE")
    private String busiDode;

    @ApiModelProperty(value = "金额")
    @TableField("AMOUNT")
    private String amount;

    @ApiModelProperty(value = "授权结果")
    @TableField("AUTH_LEVEL")
    private String authLevel;

    @ApiModelProperty(value = "授权类型")
    @TableField("AUTH_VER")
    private String authVer;

    @ApiModelProperty(value = "授权原因码")
    @TableField("REASON_CODE")
    private String reasonCode;

    @ApiModelProperty(value = "授权公用条件1")
    @TableField("REAUTH1")
    private String reauth1;

    @ApiModelProperty(value = "授权公用条件2")
    @TableField("REAUTH2")
    private String reauth2;

    @ApiModelProperty(value = "授权公用条件3")
    @TableField("REAUTH3")
    private String reauth3;

    @ApiModelProperty(value = "授权公用条件4")
    @TableField("REAUTH4")
    private String reauth4;

    @ApiModelProperty(value = "授权公用条件5")
    @TableField("REAUTH5")
    private String reauth5;

    @ApiModelProperty(value = "授权公用条件6")
    @TableField("REAUTH6")
    private String reauth6;

    @ApiModelProperty(value = "授权公用条件7")
    @TableField("REAUTH7")
    private String reauth7;

    @ApiModelProperty(value = "授权公用条件8")
    @TableField("REAUTH8")
    private String reauth8;

    @ApiModelProperty(value = "授权公用条件9")
    @TableField("REAUTH9")
    private String reauth9;

    @ApiModelProperty(value = "授权公用条件10")
    @TableField("REAUTH10")
    private String reauth10;

    @ApiModelProperty(value = "授权公用条件11")
    @TableField("REAUTH11")
    private String reauth11;

    @ApiModelProperty(value = "授权公用条件12")
    @TableField("REAUTH12")
    private String reauth12;

    @ApiModelProperty(value = "授权公用条件13")
    @TableField("REAUTH13")
    private String reauth13;

    @ApiModelProperty(value = "授权公用条件14")
    @TableField("REAUTH14")
    private String reauth14;

    @ApiModelProperty(value = "授权公用条件15")
    @TableField("REAUTH15")
    private String reauth15;

    @ApiModelProperty(value = "授权公用条件16")
    @TableField("REAUTH16")
    private String reauth16;

    @ApiModelProperty(value = "授权公用条件17")
    @TableField("REAUTH17")
    private String reauth17;

    @ApiModelProperty(value = "备注信息")
    @TableField("AUTH_REMARKS")
    private String authRemarks;


}
