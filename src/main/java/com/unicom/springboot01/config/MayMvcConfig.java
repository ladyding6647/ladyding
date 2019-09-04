package com.unicom.springboot01.config;

import com.unicom.springboot01.conponent.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 这个类是:${END}
 *
 * @author lyl
 * @version 1.0
 * Date: 2019/5/30 14:06
 */
@Configuration
public class MayMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);


        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index1").setViewName("index");

    }


    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }




}
