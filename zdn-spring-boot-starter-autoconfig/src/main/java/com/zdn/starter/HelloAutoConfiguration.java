package com.zdn.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 */
@Configuration
@ConditionalOnWebApplication // 在web环境生效的条件注解
@EnableConfigurationProperties(HelloProperties.class) // 加载properties
public class HelloAutoConfiguration {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
