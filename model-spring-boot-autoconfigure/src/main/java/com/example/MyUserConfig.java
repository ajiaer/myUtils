package com.example;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyUserProperties.class)
public class MyUserConfig {

    @Bean
    public MyUser myUser(MyUserProperties properties){
        return new MyUser(properties.getId(), properties.getUserName(), properties.getEmail(), properties.getPassword());
    }


}
