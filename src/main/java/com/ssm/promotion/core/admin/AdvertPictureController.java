package com.ssm.promotion.core.admin;

import com.ssm.promotion.core.common.Result;
import com.ssm.promotion.core.common.ResultGenerator;
import com.ssm.promotion.core.entity.AdvertPicture;
import com.ssm.promotion.core.service.AdvertPictureService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/8.
 */
@Controller
@RequestMapping("/advert")
public class AdvertPictureController {
    @Resource
    private AdvertPictureService advertPictureService;
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(AdvertPictureController.class);// 日志文件

    /**
     * 根据 type 查找广告数据
     * @param type
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getAvertPitureByType/{type}", method = RequestMethod.GET)
    @ResponseBody
    public Result getAvertPitureByType(@PathVariable("type") String type) throws Exception{
        List<AdvertPicture> advertPicture = advertPictureService.getAvertPitureByType(type);
        Result result = ResultGenerator.getSuccessResult();
        result.setData(advertPicture);
        log.info("request: advert/getAdvertPictureByType");
        return  result;
    }

    /**
     * 插入 广告图片
     * @param advertPictures
     * @return
     */
    @RequestMapping(value = "insertAdvertPic", method = RequestMethod.POST)
    @ResponseBody
    public Result insertAdvertPic(AdvertPicture advertPictures) throws Exception {
      int advertPictureModel = advertPictureService.insertAdvertPicture(advertPictures);
      Result result = ResultGenerator.getSuccessResult();
      result.setData(advertPictureModel);
        log.info("request: advert/insertAdvertPic");
      return result;
    }

}
