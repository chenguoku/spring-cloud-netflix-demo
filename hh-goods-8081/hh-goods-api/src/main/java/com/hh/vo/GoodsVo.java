package com.hh.vo;

import lombok.Data;

/**
 * @Classname: GoodsVo
 * @Description: 商品Vo
 * @Author: chenguoku
 * @Date 2020-8-21
 * @Version V1.0
 */
@Data
public class GoodsVo {

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String goodsNo;

    public GoodsVo() {
    }

    public GoodsVo(String name, String goodsNo) {
        this.name = name;
        this.goodsNo = goodsNo;
    }
}
