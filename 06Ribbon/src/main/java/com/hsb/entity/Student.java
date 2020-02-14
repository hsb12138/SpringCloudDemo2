package com.hsb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2020/2/14 20:21
 * @Created by husongbo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
