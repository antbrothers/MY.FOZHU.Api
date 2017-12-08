package com.ssm.promotion.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告图片实体
 * Created by Administrator on 2017/12/8.
 */
public class AdvertPicture implements Serializable {
    private Integer id;
    private String userId;
    private String advertPaths;
    private Date createDate;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdvertPaths() {
        return advertPaths;
    }

    public void setAdvertPaths(String advertPaths) {
        this.advertPaths = advertPaths;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "AdvertPicture{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", advertPaths='" + advertPaths + '\'' +
                ", createDate=" + createDate +
                ", type='" + type + '\'' +
                '}';
    }
}
