package com.wul.springbtest.controller;


import com.wul.springbtest.enity.Goods;
import com.wul.springbtest.service.GoodsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/GoodsMange", produces = "application/json; charset=utf-8")
public class GoodsController {
    private final GoodsService goodsService;
    private final HttpServletRequest request;

    public GoodsController(GoodsService goodsService, HttpServletRequest request) {
        this.goodsService = goodsService;
        this.request = request;
    }

    @PostMapping("/addgoods")
    public Goods addGoods(@RequestBody Goods good) {
        return goodsService.addGoods(good);
    }

}
