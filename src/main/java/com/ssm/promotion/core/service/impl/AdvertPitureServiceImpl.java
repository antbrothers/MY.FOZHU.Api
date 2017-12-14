package com.ssm.promotion.core.service.impl;

import com.ssm.promotion.core.dao.AdvertPictureDao;
import com.ssm.promotion.core.entity.AdvertPicture;
import com.ssm.promotion.core.service.AdvertPictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */

@Service("advertPictureService")
public class AdvertPitureServiceImpl implements AdvertPictureService{
    @Resource
    private AdvertPictureDao advertPictureDao;
    @Override
    public List<AdvertPicture> getAvertPitureByType(String type) {
        return advertPictureDao.getAvertPitureByType(type);
    }
    @Override
    public void insertAdvertPicture(AdvertPicture advertPicture){
         advertPictureDao.insertAdvertPicture(advertPicture);
    }
    @Override
    public void deleteAdvertPicById(String id) {
        advertPictureDao.deleteAdvertPicById(id);
    }
}
