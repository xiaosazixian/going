package zx.going.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@EnableConfigurationProperties(RedisConfigBean.class)
public class SpringRedisConfig {

    @Autowired
    private  RedisConfigBean redisConfigBean;

    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
      JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
      redisConnectionFactory.setHostName(redisConfigBean.getHost());
      redisConnectionFactory.setPort(redisConfigBean.getPort());
      return redisConnectionFactory;
    }

    @Bean
    public RedisTemplate redisTemplate(RedisConnectionFactory cf) {
      RedisTemplate redisTemplate = new RedisTemplate();
      redisTemplate.setConnectionFactory(cf);
      return redisTemplate;
    }
    
}