package com.ssm.promotion.core.service;

import com.ssm.promotion.core.entity.AdvertPicture;

import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */
public interface AdvertPictureService {
    public List<AdvertPicture> getAvertPitureByType (String type);
    public int insertAdvertPicture(AdvertPicture advertPicture);
}
