package zx.going.redisservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;
import zx.going.entity.Article;
import zx.going.util.SerializeUtil;


/**
 * Created by zx on 2015/11/21.
 */
@Service
public class ArticleRedisService extends BaseRedisService<Article>{

    private static String ArticleIDS = "articleids";



}
