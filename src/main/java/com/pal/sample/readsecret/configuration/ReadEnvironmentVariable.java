package com.pal.sample.readsecret.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "palenv")
@Getter
@Setter
public class ReadEnvironmentVariable {

    private String config1;
    private String secret1;

}
