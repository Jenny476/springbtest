package com.wul.springbtest.mapper;

import com.wul.springbtest.enity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper {
    boolean addGoods(Goods good);//发布商品

}
