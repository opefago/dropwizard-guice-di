package com.opefago.di.config;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ConfigModule extends AbstractModule {
    @Provides
    public RedisConfiguration getRedisConfiguration(AppConfiguration configuration){
        return configuration.getRedisConfiguration();
    }

    @Override
    protected void configure() {
        super.configure();
    }
}
