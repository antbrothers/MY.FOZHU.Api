package com.ssm.promotion.core.dao;

import com.ssm.promotion.core.entity.AdvertPicture;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/8.
 */
@Repository
public interface AdvertPictureDao {
    /**
     * 根据type 查询 广告数据
     * @param type
     * @return
     */
    public List<AdvertPicture> getAvertPitureByType(String type);

    /**
     * 插入广告
     * @param advertPicture
     */
    public void insertAdvertPicture(AdvertPicture advertPicture);

    /**
     * 删除广告图片
     * @param id
     */
    public void deleteAdvertPicById(String id);

}
