package com.hh.service.fallback;

import com.hh.dto.GoodsDto;
import com.hh.service.GoodsService;
import com.hh.vo.GoodsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Classname: GoodsServiceFallback
 * @Description: 商品Service Fallback
 * @Author: chenguoku
 * @Date 2020-8-21
 * @Version V1.0
 */
@Component
@Slf4j
public class GoodsServiceFallback implements GoodsService {

    @Override
    public GoodsVo getGoods(GoodsDto goodsDto) {
        log.error("获取商品信息异常，入参{}", goodsDto);
        return null;
    }
}
