package com.wul.springbtest.mapper;

import com.wul.springbtest.enity.Goods;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper {
    boolean addGoods(Goods good);
}
