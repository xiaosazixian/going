package facadeTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zx.going.ApplicationMain;
import zx.going.entity.Article;
import zx.going.facade.ArticleFacade;
import zx.going.redisservice.ArticleRedisService;

/**
 * Created by zx on 2015/11/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationMain.class, ArticleFacade.class}, loader = SpringApplicationContextLoader.class)
public class ArticleFacadeTest {

    @Autowired
    private ArticleFacade articleFacade;

    @Test
    public Article getArticle(){
        return articleFacade.getArticle(1);
    }

}
