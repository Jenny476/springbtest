package com.wul.springbtest.enity;

public class GoodsType {
    /**
     * 商品类别类
     */
    private int id;//类别编号
    private String typename;//类别名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
