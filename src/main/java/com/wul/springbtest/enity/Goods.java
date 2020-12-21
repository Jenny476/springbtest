package com.wul.springbtest.enity;

public class Goods {
    /**
     * 闲置商品类
     */
    private int id;//商品编号

    private int goods_type_id;//商品类别编号
    private GoodsType goodstype;//商品类别
    private  int user_id;
    private User user;//用户编号，谁发布的
    private GoodsState goodsState;//商品状态
    private int status;//状态：上架 下架
    private String name;//商品名称
    private int repertory;//商品库存
    private float price;//商品出售价格
    private float real_price;//商品原价
    private String release_date;//发布时间
    private String remove_date;//下架时间
    private String describle;//商品描述
    private String img;//商品图片

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoods_type_id() {
        return goods_type_id;
    }

    public void setGoods_type_id(int goods_type_id) {
        this.goods_type_id = goods_type_id;
    }

    public GoodsType getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(GoodsType goodstype) {
        this.goodstype = goodstype;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public GoodsState getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(GoodsState goodsState) {
        this.goodsState = goodsState;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepertory() {
        return repertory;
    }

    public void setRepertory(int repertory) {
        this.repertory = repertory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getReal_price() {
        return real_price;
    }

    public void setReal_price(float real_price) {
        this.real_price = real_price;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRemove_date() {
        return remove_date;
    }

    public void setRemove_date(String remove_date) {
        this.remove_date = remove_date;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
