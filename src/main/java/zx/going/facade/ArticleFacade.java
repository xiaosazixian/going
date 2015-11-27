package zx.going.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zx.going.entity.Article;
import zx.going.redisservice.ArticleRedisService;

/**
 * Created by zx on 2015/11/21.
 */
@Service
public class ArticleFacade {

    @Autowired
    private ArticleRedisService articleRedisService;

    public Article getArticle(Integer id){
        return articleRedisService.getEntity(id);
    }

    public boolean addArticle(Article article){
        return articleRedisService.addEntity(article);
    }

    public boolean updateArticle(Article article){
        return articleRedisService.updateEntity(article);
    }

}
