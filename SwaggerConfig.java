package com.mqmqm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * SwaggerConfig
 * @author xiaotugou
 * @since 2021/04/21
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.OAS_30).pathMapping("/")
                // 开启个人信息
                .apiInfo(apiInfo())
                // 选择哪些接口作为swagger的doc发布
                .select()
                .build();
    }

    /**
     * 个人信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //api文本
                .title("MrsmMiao")
                //说明
                .description("Contact Us")
                //用户名 + 网址 + 邮箱
                .contact(new Contact("MrsmMiao" ,
                        "https://github.com/MiaoOwO" ,
                        "2330573855@qq.com"))
                //版本
                .version("1.0")
                //运行
                .build();
    }
}
