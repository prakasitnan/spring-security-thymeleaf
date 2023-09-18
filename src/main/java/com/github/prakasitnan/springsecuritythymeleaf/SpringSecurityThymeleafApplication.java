package com.github.prakasitnan.springsecuritythymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.util.Locale;

@SpringBootApplication
public class SpringSecurityThymeleafApplication  {


    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityThymeleafApplication.class, args);
    }

}
