package com.example.server.config;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>Created by Damon.Q on 2017/10/27.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.regex("/v1/.*"))
            .build()
            .host("localhost:8080")
            .protocols(Sets.newHashSet("http", "https"))
            .securitySchemes(Lists.newArrayList(new ApiKey("api_key", "api_key", "header")))
            .securityContexts(Lists.newArrayList(securityContext()))
            .apiInfo(apiInfo())
            //.useDefaultResponseMessages(false)
            //.globalResponseMessage(RequestMethod.GET, Lists.newArrayList(
            //    new ResponseMessageBuilder()
            //        .code(500)
            //        .message("500 message")
            //        .responseModel(new ModelRef("Error"))
            //        .build(),
            //    new ResponseMessageBuilder()
            //        .code(403)
            //        .message("Forbidden!")
            //        .build()))
            ;
    }

    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Lists.newArrayList("*"));
        config.setAllowedHeaders(Lists.newArrayList("*"));
        config.setAllowedMethods(Lists.newArrayList("*"));
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
            .securityReferences(defaultAuth())
            .forPaths(PathSelectors.regex("/v1/book/.*"))
            .build();
    }

    private List<SecurityReference> defaultAuth() {
        return Lists.newArrayList(new SecurityReference("api_key", new AuthorizationScope[0]));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Swagger Demo")
            .description("Swagger的简单示例, 包括swagger-codegen, swagger2markup 和 asciidoctor.")
            .termsOfServiceUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .contact(new Contact("Damon", "http://www.google.com", "damon.q@iv66.net"))
            .license("Apache License")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .version("v1")
            .build();
    }
}
