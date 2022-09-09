package com.hxb.rulesConfig.service;

import com.hxb.rulesConfig.entity.RulesConfigPo;

/**
 * @author: 小红红
 * @create: 2022-09-06 09:53
 * @description:
 **/

public interface RulesConfigService {
    int insert(RulesConfigPo po);

    RulesConfigPo selectById(String ruleId);


}
