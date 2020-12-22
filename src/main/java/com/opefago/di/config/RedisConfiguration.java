package com.opefago.di.config;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@NotNull
@Getter
@ToString
public class RedisConfiguration {
    @JsonProperty("uri") private String uri;
    @JsonProperty("port") private String port;
    @JsonProperty("idleConnectionTimeout") private String idleConnectionTimeout;
    @JsonProperty("connectTimeout") private long connectTimeout;
    @JsonProperty("timeout") private long timeout;
    @JsonProperty("retryAttempts") private int retryAttempts;
    @JsonProperty("retryInterval") private long retryInterval;
}
