package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceConfig.class,PersitenceConfig.class,AOPConfig.class})
public class AppConfig {

}
