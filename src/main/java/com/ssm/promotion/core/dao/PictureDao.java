package com.ssm.promotion.core.dao;

import com.ssm.promotion.core.entity.Picture;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/20.
 */
@Repository
public interface PictureDao {
    /**
     * 返回相应的数据集合
     * @param map
     * @return
     */
    public List<Picture> findPictures(Map<String, Object> map);
    /**
     * 数据数目
     *
     * @param map
     * @return
     */
    public Long getTotalPictures(Map<String, Object> map);
    public int insertPicture(Picture picture);
    public int updPicture(Picture picture);
    public int delPicture(String id);
    public Picture findPictureById(String id);
}
