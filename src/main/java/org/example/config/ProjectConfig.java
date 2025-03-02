package org.example.config;


import org.example.singletonBeans.EagerBean;
import org.example.singletonBeans.LazyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean
    @Lazy
    public LazyBean lazyBean(){
        return new LazyBean();
    }
    @Bean
    public EagerBean eagerBean(){
        return new EagerBean();
    }
}
