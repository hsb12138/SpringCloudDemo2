package com.hsb.controller;

import com.hsb.entity.Student;
import com.hsb.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Classname FeignHandler
 * @Description TODO
 * @Date 2020/2/14 20:41
 * @Created by husongbo
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
