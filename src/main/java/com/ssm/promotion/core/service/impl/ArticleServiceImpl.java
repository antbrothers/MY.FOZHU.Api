package com.ssm.promotion.core.service.impl;

import com.ssm.promotion.core.dao.ArticleDao;
import com.ssm.promotion.core.entity.Article;
import com.ssm.promotion.core.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/20.
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;
    @Override
    public List<Article> findArticle(Map<String, Object> map) {
        return articleDao.findArticles(map);
    }

    @Override
    public Long getTotalArticle(Map<String, Object> map){
        return articleDao.getTotalArticles(map);
    }

    @Override
    public int addArticle(Article article) { return articleDao.insertArticle(article);}

    @Override
    public int updateArticle(Article article) { return articleDao.updArticle(article);}
    public int deleteArticle(String id) {
         return articleDao.delArticle(id);
    }
    public Article findById(String id) { return articleDao.getArticleById(id);}
}
