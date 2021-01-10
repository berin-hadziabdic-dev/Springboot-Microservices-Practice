package com.cloud.gateway.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.*;

@Configuration
public class GatewayBeans {

    @Bean
    public ServerCodecConfigurer getCodecConfigurer() {
        return ServerCodecConfigurer.create();
    }

}
