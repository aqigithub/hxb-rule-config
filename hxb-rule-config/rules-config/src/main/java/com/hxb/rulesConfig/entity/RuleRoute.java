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
 * 规则路由表
 * </p>
 *
 * @author 赵长红
 * @since 2022-09-08 21:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("RULE_ROUTE")
@ApiModel(value="RuleRoute对象", description="规则路由表")
public class RuleRoute implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键 路由ID")
      @TableId("ROUTE_ID")
    private String routeId;

    @ApiModelProperty(value = "路由key")
    @TableField("ROUTE_KEY")
    private String routeKey;

    @ApiModelProperty(value = "路由值")
    @TableField("ROUTE_VALUE")
    private String routeValue;

    @ApiModelProperty(value = "路由策略")
    @TableField("ROUTE_POLICY")
    private String routePolicy;

    @ApiModelProperty(value = "路由备注")
    @TableField("ROUTE_REMARKS")
    private String routeRemarks;


}
