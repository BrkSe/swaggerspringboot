package com.burakkutbay.swaggerspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by hasanburakkutbay on 25.06.2020.
 */
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.burakkutbay.swaggerspringboot"))
                .paths(PathSelectors.regex("/api.*"))
                .build()
                .apiInfo(info());
    }

    private ApiInfo info() {

        return new ApiInfo(
                "Student API",
                "Students API",
                "v1",
                "apiserviceurl",
                new Contact("Burak KUTBAY", "https://burakkutbay.com", "mail@adresi.com"),
                "MIT License",
                "https://opensource.org/licenses/MIT"
        );
    }
}
