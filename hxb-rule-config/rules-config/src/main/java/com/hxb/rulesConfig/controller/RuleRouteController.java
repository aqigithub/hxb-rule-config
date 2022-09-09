package com.hxb.rulesConfig.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 规则路由表 前端控制器
 * </p>
 *
 * @author 赵长红
 * @since 2022-09-08 21:22
 */
@RestController
@RequestMapping("/ruleRoute")
@Component
@Slf4j
@RefreshScope
public class RuleRouteController {

}

