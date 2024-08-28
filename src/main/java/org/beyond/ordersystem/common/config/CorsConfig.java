package org.beyond.ordersystem.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://www.woojin.today") // 허용 url 명시
                .allowedMethods("*").allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}