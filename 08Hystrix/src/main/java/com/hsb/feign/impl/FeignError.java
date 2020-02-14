package com.hsb.feign.impl;

import com.hsb.entity.Student;
import com.hsb.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Classname FeignProviderClient
 * @Description TODO
 * @Date 2020/2/14 20:42
 * @Created by husongbo
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }
    @Override
    public String index() {
        return "服务器维护中......";
    }
}
