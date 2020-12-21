package com.wul.springbtest.controller;


import com.wul.springbtest.enity.Goods;
import com.wul.springbtest.service.GoodsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/GoodsMange", produces = "application/json; charset=utf-8")
public class GoodsController {
    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService){ this.goodsService=goodsService;}

    /**
     * 发布商品
     */
    @PostMapping("/addgoods")
    public Map<String,String> addGoods(@RequestBody  Goods good){
        Map<String,String> retMap = new HashMap<String, String>();
        boolean result = goodsService.addGoods(good);
        if(!result){
            retMap.put("type", "error");
            retMap.put("msg", "发布失败");
        } else {
            retMap.put("type", "success");
            retMap.put("msg", "发布成功");
        }
        return retMap;
    }

}
