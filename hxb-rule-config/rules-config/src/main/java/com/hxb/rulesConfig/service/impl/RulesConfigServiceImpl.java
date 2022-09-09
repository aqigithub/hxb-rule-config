package com.hxb.rulesConfig.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxb.rulesConfig.entity.RulesConfigPo;
import com.hxb.rulesConfig.mapper.RulesConfigMapper;
import com.hxb.rulesConfig.service.RulesConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 小红红
 * @create: 2022-09-06 10:32
 * @description:
 **/
@Service
public class RulesConfigServiceImpl
        extends ServiceImpl<RulesConfigMapper,RulesConfigPo>
        implements RulesConfigService {

    @Autowired
    private RulesConfigMapper rulesConfigMapper;

    @Override
    public int insert(RulesConfigPo po) {
        LambdaQueryWrapper<RulesConfigPo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RulesConfigPo::getRuleId,1);
        List<RulesConfigPo> list = list(queryWrapper);

        save(po);
        int result = rulesConfigMapper.insert(po);
        return result;
    }


    @Override
    public RulesConfigPo selectById(String ruleId) {
        RulesConfigPo po = rulesConfigMapper.selectById(ruleId);
        return po;
    }
}
