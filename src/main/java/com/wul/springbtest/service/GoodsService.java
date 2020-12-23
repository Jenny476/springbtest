package com.wul.springbtest.service;

import com.wul.springbtest.enity.Goods;
import com.wul.springbtest.mapper.GoodsMapper;
import com.wul.springbtest.utils.PrimaryKey;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class GoodsService {
    private final GoodsMapper goodsMapper;
    private HttpServletRequest request;
    private LoginService loginService;

    public GoodsService(GoodsMapper goodsMapper, HttpServletRequest request, LoginService loginService) {
        this.goodsMapper = goodsMapper;
        this.request = request;
        this.loginService = loginService;
    }

    public Goods addGoods(Goods goods) {
        goods.setGoodsId(new PrimaryKey().random());
        goods.setCreatorId(loginService.isLogin(request).getUserId());
        goods.setCreateTime(new Date());
        goods.setModifierId(loginService.isLogin(request).getUserId());
        goods.setModifyTime(new Date());
        goods.setDelete(false);
        goodsMapper.addGoods(goods);
        return goods;
    }
}
