package com.hxb.rulesConfig.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hxb.rulesConfig.entity.RuleAuth;
import com.hxb.rulesConfig.mapper.RuleAuthMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxb.rulesConfig.service.RuleAuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 新的远程授权业务-授权规则表 服务实现类
 * </p>
 *
 * @author 赵长红
 * @since 2022-09-09
 */
@Service
@Slf4j
public class RuleAuthServiceImpl extends ServiceImpl<RuleAuthMapper, RuleAuth> implements RuleAuthService {

    @Resource
    private RuleAuthMapper ruleAuthMapper;

    /**
     * 根据交易码查询规则
     *
     * @param busiDode 交易码
     * @return
     */
    @Override
    public List<RuleAuth> selectByBusiDode(String busiDode) {
        log.info("交易码查询规则接口调用，交易码busiDode=" + busiDode);
        if (Objects.isNull(busiDode)) {
            return null;
        }
        LambdaQueryWrapper<RuleAuth> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RuleAuth::getBusiDode, busiDode);
//        queryWrapper.orderByDesc(RuleAuth::getAuthId);
        return ruleAuthMapper.selectList(queryWrapper);
    }

}
