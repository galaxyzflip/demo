package com.example.demo.config;

import com.example.demo.service.ManService;
import com.example.demo.service.NameService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.naming.Name;

@Configuration
public class AppConfig {

    @Bean
    public NameService nameService(){
        NameService service = new NameService("kenneth");
        service.setAge(37);
        return service;
    }

    @Bean
    public ManService manService(NameService nameService){
        ManService manService = new ManService(nameService);
        manService.setEmail("pigcs11@gmail.com");
        return manService;
    }
}
