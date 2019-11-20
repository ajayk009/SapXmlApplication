package com.springmongorest.repository;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongorest.model.Student;


@JaversSpringDataAuditable
public interface StudentRepository extends MongoRepository<Student, String> {
    Student findStudentByName(String name);
}
