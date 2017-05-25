package com.iqmsoft.spring.aspects.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.iqmsoft.spring.aspects"})
@EnableAspectJAutoProxy
public class AppConfig {

}
