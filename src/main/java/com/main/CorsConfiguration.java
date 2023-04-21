package com.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/graphql/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST")
                .allowCredentials(false)
                .maxAge(3600);
    }
}

