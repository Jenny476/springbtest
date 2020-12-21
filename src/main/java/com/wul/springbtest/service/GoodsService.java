package com.wul.springbtest.service;

import com.wul.springbtest.enity.Goods;
import com.wul.springbtest.mapper.GoodsMapper;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    private final GoodsMapper goodsMapper;

    public GoodsService(GoodsMapper goodsMapper){this.goodsMapper=goodsMapper;}

    /**
     * 发布商品
     * @param good
     * @return
     */
    public boolean addGoods(Goods good){
        return goodsMapper.addGoods(good);
    }
    /**
     *
     */


}
