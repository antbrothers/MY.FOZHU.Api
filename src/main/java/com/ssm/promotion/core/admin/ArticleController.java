package com.ssm.promotion.core.admin;

import com.ssm.promotion.core.common.Result;
import com.ssm.promotion.core.common.ResultGenerator;
import com.ssm.promotion.core.entity.Article;
import com.ssm.promotion.core.entity.PageBean;
import com.ssm.promotion.core.service.ArticleService;
import com.ssm.promotion.core.util.StringUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2017/9/20.
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(ArticleController.class);// 日志文件

    @RequestMapping(value = "/getArticle", method = RequestMethod.GET)
    @ResponseBody
    public Result list( @RequestParam(value = "page", required = false) String page,
                        @RequestParam(value = "rows", required = false) String rows,
                        Article article) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        if (page !=null && rows !=null) {
            PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
            map.put("start", pageBean.getStart());
            map.put("size", pageBean.getPageSize());
        }
        if (article != null) {
            map.put("articleTitle", StringUtil.formatLike(article.getArticleTitle()));
        }
        List<Article> articleList = articleService.findArticle(map);
        Long total = articleService.getTotalArticle(map);


        Result result = ResultGenerator.getSuccessResult();
        Map data = new HashMap();
        data.put("rows", articleList);
        data.put("total", total);
        result.setData(data);
        return result;
    }

    /**
     * 根据id查找
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getArticleById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findById(@PathVariable("id") String id) throws Exception {

        Article article = articleService.findById(id);
        Result result = ResultGenerator.getSuccessResult();
        result.setData(article);
        log.info("request: article/findById");
        return result;
    }


}
