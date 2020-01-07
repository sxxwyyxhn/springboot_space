package com.xdkj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xh
 * @create 2020-03 11:17
 */
@Configuration
@EnableSwagger2
public class swaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //要扫描的路径
                .apis(RequestHandlerSelectors.basePackage("com.xdkj.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return  new ApiInfoBuilder()
                .title("标题")
                .description("描述")
                .termsOfServiceUrl("localhost:8080")
                .contact(new Contact("zswb项目","localhost:8080/ruleengine/swagger-ui.html","974900744@qq.com"))
                .version("0.0.1")
                .build();


    }
}
