package ServiceRedisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zx.going.ApplicationMain;
import zx.going.entity.Article;
import zx.going.redisservice.ArticleRedisService;

/**
 * Created by zx on 2015/11/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationMain.class, ArticleRedisService.class}, loader = SpringApplicationContextLoader.class)
public class ArticleRedisTest {

    @Autowired
    private ArticleRedisService articleRedis;

    @Test
    public void addArticle(){
        Article article = new Article();
        article.setId(1);
        articleRedis.addEntity(article);
    }

    @Test
    public void getArticle(){
        Article article = articleRedis.getEntity(1);
        System.out.println("article : " + article.getId());
    }

}
