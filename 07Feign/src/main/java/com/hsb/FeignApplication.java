package com.hsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname FeignApplication
 * @Description TODO
 * @Date 2020/2/14 20:39
 * @Created by husongbo
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
