package com.hh.hhgoodsprovider.service.impl;

import com.hh.dto.GoodsDto;
import com.hh.service.GoodsService;
import com.hh.vo.GoodsVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: GoodsServiceImpl
 * @Description: 商品Service
 * @Author: chenguoku
 * @Date 2020-8-21
 * @Version V1.0
 */
@RestController
@RequestMapping("goods")
public class GoodsServiceImpl implements GoodsService {

    @Override
    public GoodsVo getGoods(@RequestBody GoodsDto goodsDto) {
        GoodsVo goodsVo = new GoodsVo("测试", goodsDto.getGoodsNo());
        return goodsVo;
    }
}
