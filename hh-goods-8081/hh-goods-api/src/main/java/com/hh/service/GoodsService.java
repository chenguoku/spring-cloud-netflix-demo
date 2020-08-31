package com.hh.service;

import com.hh.constant.ServerNameConstant;
import com.hh.constant.ServerPathConstant;
import com.hh.dto.GoodsDto;
import com.hh.service.fallback.GoodsServiceFallback;
import com.hh.vo.GoodsVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Classname: GoodsServices
 * @Description: 商品Service
 * @Author: chenguoku
 * @Date 2020-8-20
 * @Version V1.0
 */
@FeignClient(name = ServerNameConstant.HH_GOODS,
        path = ServerPathConstant.GOODS_PATH + "/goods",
        fallback = GoodsServiceFallback.class)
public interface GoodsService {

    /**
     * 获取商品信息
     */
    @PostMapping("info")
    GoodsVo getGoods(@RequestBody GoodsDto goodsDto);

}
