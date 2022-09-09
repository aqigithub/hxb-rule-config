package com.hxb.rulesConfig.controller;

import com.hxb.rulesConfig.entity.RulesConfigPo;
import com.hxb.rulesConfig.service.RulesConfigService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 小红红
 * @create: 2022-09-06 09:56
 * @description:
 **/
@RestController
@Component
@Slf4j
@RefreshScope
public class RulesCongifController {

    @Autowired
    private RulesConfigService rulesConfigService;

    @GetMapping("test/{number}")
    public String insertMessage(@Param("number") int number) {
        RulesConfigPo po = new RulesConfigPo();
        po.setRuleId("001" + number);
        po.setRuleKey("code");
        po.setRuleValue("401573");
        po.setRuleDesc("补/换卡");
        int result = rulesConfigService.insert(po);
        String ruleId = po.getRuleId();
        System.out.println("ruleid:" + ruleId);
        return ruleId;
    }

    @GetMapping("test")
    public String test(String number) {
        RulesConfigPo po = new RulesConfigPo();
        po.setRuleId(number);
        po.setRuleKey("code");
        po.setRuleValue("401573");
        po.setRuleDesc("补/换卡");
        int result = rulesConfigService.insert(po);
        String ruleId = po.getRuleId();
        log.info("ruleid:" + ruleId);
        return ruleId;
    }

    @GetMapping("selectMessage")
    public String selectMessage() {
        RulesConfigPo po = new RulesConfigPo();
        po.setRuleId("002");
        po = rulesConfigService.selectById(po.getRuleId());
        log.info("po:" + po);
        return po.toString();
    }

    //nacos
    @Value(value = "${service.name}")
    private String serviceName;

    @GetMapping("nacosTest")
    public String nacosTest() {
        log.info("username:" + serviceName);
        return serviceName;
    }


}
