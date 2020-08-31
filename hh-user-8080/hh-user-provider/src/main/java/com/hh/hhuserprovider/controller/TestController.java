package com.hh.hhuserprovider.controller;

import com.hh.dto.GoodsDto;
import com.hh.service.GoodsService;
import com.hh.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: TestController
 * @Description: 测试用户Controller
 * @Author: chenguoku
 * @Date 2020-8-21
 * @Version V1.0
 */
@RestController
public class TestController {

    @Autowired
    private GoodsService goodsService;

    @Value("${test.apollo.config}")
    private String configString;

    @GetMapping("info/{no}")
    public GoodsVo getGoodsInfo(@PathVariable(value = "no") String no) {
        GoodsVo goods = goodsService.getGoods(new GoodsDto(no));
        return goods;
    }

    @GetMapping("test/config")
    public String testConfig() {
        return configString;
    }

}
