package com.hsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname RestTemplateApplication
 * @Description TODO
 * @Date 2020/2/14 20:29
 * @Created by husongbo
 */
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
