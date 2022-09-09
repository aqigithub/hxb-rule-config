package com.hxb.rulesConfig.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: 小红红
 * @create: 2022-09-06 09:28
 * @description: 实体对象
 **/
@Data
@TableName("rule_config")
public class RulesConfigPo implements Serializable {
    @TableId(value = "rule_id", type = IdType.ASSIGN_UUID)
    private String ruleId;

    private String ruleKey;
    private String ruleValue;
    private String ruleRemarks;
    private String ruleDesc;

}
