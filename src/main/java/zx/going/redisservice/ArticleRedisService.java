package zx.going.redisservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zx.going.entity.Article;

/**
 * Created by zx on 2015/11/21.
 */
@Service
public class ArticleRedisService extends BaseRedisService<Article>{

    private static String ArticleIDS = "articleids";



}
