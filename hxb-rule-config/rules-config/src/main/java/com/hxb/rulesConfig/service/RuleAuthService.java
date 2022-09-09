package com.hxb.rulesConfig.service;

import com.hxb.rulesConfig.entity.RuleAuth;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 新的远程授权业务-授权规则表 服务类
 * </p>
 *
 * @author 赵长红
 * @since 2022-09-09
 */
public interface RuleAuthService extends IService<RuleAuth> {

    /**
     * 根据交易码查询规则
     * @param busiDode 交易码
     * @return
     */
    List<RuleAuth> selectByBusiDode(String busiDode);



}
