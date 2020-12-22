package com.opefago.di.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import lombok.Getter;

import javax.validation.constraints.NotNull;


@NotNull
@Getter
public class AppConfiguration extends Configuration {
    @JsonProperty("redis") private RedisConfiguration redisConfiguration;
}
