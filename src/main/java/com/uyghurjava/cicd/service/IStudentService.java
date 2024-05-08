package com.uyghurjava.cicd.service;

import com.uyghurjava.cicd.model.Student;
import com.uyghurjava.cicd.respository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IStudentService implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public Student save(Student s) {
        return null;
    }

    @Override
    public List<Student> findAllStudents() {
        return List.of();
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student update(Student s) {
        return null;
    }

    @Override
    public void delete(String email) {

    }
}
