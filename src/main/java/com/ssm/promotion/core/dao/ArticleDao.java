package com.ssm.promotion.core.dao;

import com.ssm.promotion.core.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/20.
 */
@Repository
public interface ArticleDao {
    /**
     * 返回相应的数据集合
     * @param map
     * @return
     */
    public List<Article> findArticles(Map<String, Object> map);

    /**
     * 数据数目
     * @param map
     * @return
     */
    public Long getTotalArticles(Map<String, Object> map);

    public int insertArticle(Article article);
    public int updArticle(Article article);
    public int delArticle(String id);
    public Article getArticleById(String id);
}
