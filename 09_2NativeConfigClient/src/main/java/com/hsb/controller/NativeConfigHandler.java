package com.hsb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname NativeConfigHandler
 * @Description TODO
 * @Date 2020/2/14 20:53
 * @Created by husongbo
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;
    @GetMapping("/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}
