package com.wul.springbtest.enity;

public class GoodsType {
    /**
     * 商品类别类
     */
    private String id;//类别编号
    private String typename;//类别名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
