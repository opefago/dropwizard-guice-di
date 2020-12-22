package com.opefago.di.services;

import com.opefago.di.config.RedisConfiguration;
import io.dropwizard.lifecycle.Managed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RedisService implements Managed {
    Logger logger = LoggerFactory.getLogger(RedisService.class);


    private RedisConfiguration redisConfiguration;

    @Inject
    public RedisService(final RedisConfiguration redisConfiguration){
        this.redisConfiguration = redisConfiguration;
        logger.info("Configuration {}", redisConfiguration);
    }

    @Override
    public void start() throws Exception {
        logger.info("Configuration {}", redisConfiguration);
    }

    @Override
    public void stop() throws Exception {

    }
}
