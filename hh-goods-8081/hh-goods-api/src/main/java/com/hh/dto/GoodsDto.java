package com.hh.dto;

import lombok.Data;

/**
 * @Classname: GoodsDto
 * @Description: 商品Dto
 * @Author: chenguoku
 * @Date 2020-8-21
 * @Version V1.0
 */
@Data
public class GoodsDto {

    /**
     * 商品编码
     */
    private String goodsNo;

    public GoodsDto() {
    }

    public GoodsDto(String goodsNo) {
        this.goodsNo = goodsNo;
    }
}
