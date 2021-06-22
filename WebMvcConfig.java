package com.mqmqm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: MrsmMiao
 * @DateTime: 2021/6/14 15:27
 * @Description: 资源映射配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/pic/**").addResourceLocations("file:/opt/res/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
