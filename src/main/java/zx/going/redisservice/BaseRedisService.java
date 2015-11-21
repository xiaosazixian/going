package zx.going.redisservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import zx.going.entity.BaseEntity;
import zx.going.util.SerializeUtil;

/**
 * Created by zx on 2015/11/21.
 */
public class BaseRedisService<T> {

    @Autowired
    private RedisTemplate redisTemplate;

    public boolean addEntity(final T entity) {
        Boolean result = (Boolean)redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] key = serializer.serialize(String.valueOf(((BaseEntity) entity).getId()));
                byte[] value = SerializeUtil.serialize(entity);
                redisConnection.set(key, value);
                return true;
            }
        });
        return result;
    }

    public T getEntity(final Integer id){
        T result =  (T)redisTemplate.execute(new RedisCallback<T>() {
            @Override
            public T doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] key = serializer.serialize(String.valueOf(id));
                T entity = (T)SerializeUtil.unserialize(redisConnection.get(key));
                return entity;
            }
        });
        return result;
    }

}
