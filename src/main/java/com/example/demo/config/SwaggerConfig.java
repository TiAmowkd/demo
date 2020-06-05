package com.example.demo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2).
                groupName("接口API").
                genericModelSubstitutes(DeferredResult.class).
                useDefaultResponseMessages(false).
                forCodeGeneration(true).
                select().
//              apis(RequestHandlerSelectors.basePackage("com.young")).
        apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).
                        build().
                        apiInfo(apiInfo());
        return docket;
    }
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("测试",//大标题
                "",//小标题
                "1.0",//版本
                "无",
                new Contact("王凯迪", "", ""),//作者
                "链接(无)",//链接显示文字
                "网站链接"//网站链接
        );
        return apiInfo;
    }
}
