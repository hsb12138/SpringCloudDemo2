package com.hsb.repository;

import com.hsb.entity.Student;

import java.util.Collection;

/**
 * @Classname StudentRepository
 * @Description TODO
 * @Date 2020/2/14 20:23
 * @Created by husongbo
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
