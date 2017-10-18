package com.ssm.promotion.core.service.impl;

import com.ssm.promotion.core.dao.PictureDao;
import com.ssm.promotion.core.entity.Picture;
import com.ssm.promotion.core.service.PictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/20.
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureService {
    @Resource
    private PictureDao pictureDao;

    @Override
    public List<Picture> findPicture(Map<String, Object> map) {
        return pictureDao.findPictures(map);
    }

    @Override
    public Long getTotalPicture(Map<String, Object> map) {
        return pictureDao.getTotalPictures(map);
    }
    @Override
    public int addPicture(Picture picture) {
        return pictureDao.insertPicture(picture);
    }

    @Override
    public int updatePicture(Picture picture) {
        return pictureDao.updPicture(picture);
    }

    @Override
    public int deletePicture(String id) {
        return pictureDao.delPicture(id);
    }

    @Override
    public Picture findById(String id) {
        return pictureDao.findPictureById(id);
    }

}
