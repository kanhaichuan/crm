package com.example.crm.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @date:2019/5/23
 * @author:felix
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @SuppressWarnings("all")
    @Bean
    public FilterRegistrationBean regist(){
        FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(new MyFilter());
        frBean.addUrlPatterns("/*");
        return frBean;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/crm/image","/crm/jquery").addResourceLocations("classpath:/crm/image/","classpath:/crm/jquery/");
    }
}
