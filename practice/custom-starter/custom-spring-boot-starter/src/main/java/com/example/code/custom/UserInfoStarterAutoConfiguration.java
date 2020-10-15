package com.example.code.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(UserTemplate.class)
//这个注解的作用是把UserInfoProperties类的属性放入到env环境中
@EnableConfigurationProperties(UserInfoProperties.class)
@ConditionalOnProperty(prefix = "spring.user.custom",name = "enable", matchIfMissing = true)
public class UserInfoStarterAutoConfiguration {

    @Autowired
    private UserInfoProperties userInfoProperties;

    @Bean
    @ConditionalOnMissingBean(UserTemplate.class)
    public UserTemplate userTemplate(){
        return new UserTemplate(userInfoProperties);
    }
}
