package com.springmongorest.service;

import java.util.List;

import com.springmongorest.model.Student;

public interface StudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    List<Student> getAllStudent();
    void deleteStudent(String id);
    Student getStudentByName(String name);
}
