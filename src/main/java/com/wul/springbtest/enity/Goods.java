package com.wul.springbtest.enity;

import java.util.Date;

public class Goods {
    /**
     * db_column: goods_id (varchar(32)) 不为null primary key
     */
    private String goodsId;
    /**
     * db_column: goods_type_id (varchar(32)) 不为null
     */
    private String goodsTypeId;
    /**
     * db_column: goods_state_id (varchar(32)) 不为null
     */
    private String goodsStateId;
    /**
     * db_column: goods_name (varchar(64)) 不为null
     */
    private String goodsName;
    /**
     * db_column: repertory (int(16)) 不为null
     */
    private int repertory;
    /**
     * db_column: price (float(16)) 不为null
     */
    private float price;
    /**
     * db_column: realPrice (float(16)) 不为null
     */
    private float realPrice;
    /**
     * db_column: creator_id (varchar(32)) 不为null
     */
    private String creatorId;
    /**
     * db_column: create_time (timestamp) 不为null
     */
    private Date createTime;
    /**
     * db_column: modifier_id (varchar(32)) 不为null
     */
    private String modifierId;
    /**
     * db_column: modifier_time (timestamp) 不为null
     */
    private Date modifyTime;
    /**
     * db_column: isDelete  (bit(1)） 不为null
     */
    private Boolean isDelete;
    /**
     * db_column: deleter_id (varchar(32)) 可为null
     */
    private String deleterId;
    /**
     * db_column: delete_time (timestamp) 可为null
     */
    private Date deleteTime;
    /**
     * db_column: description (varchar(512)) 可为null
     */
    private String description;
    /**
     * db_column: logo (varchar(64)) 可为null
     */
    private String logo;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsStateId() {
        return goodsStateId;
    }

    public void setGoodsStateId(String goodsStateId) {
        this.goodsStateId = goodsStateId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public float getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(float realPrice) {
        this.realPrice = realPrice;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getDeleterId() {
        return deleterId;
    }

    public void setDeleterId(String deleterId) {
        this.deleterId = deleterId;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
