package com.hsb.feign;

import com.hsb.entity.Student;
import com.hsb.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Classname FeignProviderClient
 * @Description TODO
 * @Date 2020/2/14 20:40
 * @Created by husongbo
 */
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
