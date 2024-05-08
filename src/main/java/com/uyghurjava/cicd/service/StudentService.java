package com.uyghurjava.cicd.service;

import com.uyghurjava.cicd.model.Student;

import java.util.List;

public interface StudentService {
    Student save(Student s);
    List<Student> findAllStudents();
    Student findByEmail(String email);
    Student update(Student s);
    void delete(String email);
}
