package zx.going.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zx on 2015/11/21.
 */

@ConfigurationProperties(prefix="spring.data.mongodb")
public class RedisConfigBean {

    private  String database;
    private  String host;
    private  String password;
    private  Integer port;
    private  Integer maxIdle;
    private  Integer minIdle;
    private  Integer maxActive;
    private  Integer maxWait;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    public Integer getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    public Integer getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(Integer maxWait) {
        this.maxWait = maxWait;
    }

    public Integer getSentinelMaster() {
        return sentinelMaster;
    }

    public void setSentinelMaster(Integer sentinelMaster) {
        this.sentinelMaster = sentinelMaster;
    }

    public Integer getSentinelNodes() {
        return sentinelNodes;
    }

    public void setSentinelNodes(Integer sentinelNodes) {
        this.sentinelNodes = sentinelNodes;
    }

    private  Integer sentinelMaster;
    private  Integer sentinelNodes;

}
