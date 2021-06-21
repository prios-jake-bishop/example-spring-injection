package com.geekmode.examplespringinjection.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("fooByName")
    public String getFoo() {
        return "foo-from-named-bean";
    }

    @Bean("barByName")
    public String getBar() {
        return "bar-from-named-bean";
    }

    @Bean
    public String fooByFunctionName() {
        return "foo-by-function-name";
    }

    @Bean
    public String barByFunctionName() {
        return "bar-by-function-name";
    }

}
