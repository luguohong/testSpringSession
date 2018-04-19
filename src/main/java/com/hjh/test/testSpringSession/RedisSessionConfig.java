package com.hjh.test.testSpringSession;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@PropertySource("classpath:redis.properties")
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800, redisNamespace = "kml")
public class RedisSessionConfig {

}
