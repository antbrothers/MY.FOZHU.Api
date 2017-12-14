package com.ssm.promotion.core.admin;

import com.ssm.promotion.core.common.Result;
import com.ssm.promotion.core.common.ResultGenerator;
import com.ssm.promotion.core.entity.AdvertPicture;
import com.ssm.promotion.core.service.AdvertPictureService;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.aspectj.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
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
    private Object ServletRequestAttributes;

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
     * @param
     * @return
     */
    @RequestMapping(value = "testFileInsert", method = RequestMethod.POST)
    @ResponseBody
    public Result testFileInsert(AdvertPicture advertPicture, @RequestParam MultipartFile[] file, HttpServletRequest request) throws Exception{
        for (MultipartFile myfile: file) {
            if (myfile.isEmpty()) {
                System.out.println("文件未上传");
            } else {
                System.out.println("文件长度: " + myfile.getSize());
                System.out.println("文件类型: " + myfile.getContentType());
                System.out.println("文件名称: " + myfile.getName());
                System.out.println("文件原名: " + myfile.getOriginalFilename());
                String realPath = "E:\\工作目录\\java工作\\main\\MY.FOZHU.Api\\src\\main\\webapp\\upload";
                FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, myfile.getOriginalFilename()));
                advertPicture.setAdvertPaths(realPath);
            }
        }
        advertPictureService.insertAdvertPicture(advertPicture);
        Result result = ResultGenerator.getSuccessResult();
        result.setData(advertPicture);
        return result;
    }

    /**
     * 删除广告 图片
     * @param id
     * @return
     */
    @RequestMapping(value = "deleteAdvertPicById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result deleteAdvertPicById (@PathVariable("id") String id) {
        if (id.isEmpty()) {
            System.out.println("参数id不能为空");
        }
        advertPictureService.deleteAdvertPicById(id);
        Result result = ResultGenerator.getSuccessResult();
        return  result;
    }
}
