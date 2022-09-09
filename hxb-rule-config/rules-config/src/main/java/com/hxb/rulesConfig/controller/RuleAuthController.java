package com.hxb.rulesConfig.controller;


import com.hxb.rulesConfig.entity.RuleAuth;
import com.hxb.rulesConfig.service.RuleAuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 新的远程授权业务-授权规则表 前端控制器
 * </p>
 *
 * @author 赵长红
 * @since 2022-09-09 09：09
 */
@RestController
@RequestMapping("/ruleAuth")
@Component
@Slf4j
@RefreshScope
public class RuleAuthController {


    @Resource
    private RuleAuthService ruleAuthService;


    @GetMapping("/selectByBusiDode")
    public String selectByBusiDode(String busiDode) {
        List<RuleAuth> list = ruleAuthService.selectByBusiDode(busiDode);
        String message = list.toString();
        return message;
    }


}

