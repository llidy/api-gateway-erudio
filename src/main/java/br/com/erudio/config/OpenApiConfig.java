package br.com.erudio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Api Gateway Erudio")
                        .version("v1")
                        .description("Api Java 18 + Spring Boot 3")
                        .termsOfService("https://erudio.com.br/meus-cursos")
                        .license(new License()
                                    .name("Apache 2.0")
                                    .url("https://erudio.com.br/meus-cursos")));
    }
}
