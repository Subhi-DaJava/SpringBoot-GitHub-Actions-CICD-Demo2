package com.uyghurjava.cicd.controller;

import com.uyghurjava.cicd.model.Student;
import com.uyghurjava.cicd.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public Student save(
            @RequestBody Student student
    ) {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable("email") String email
    ) {
        return service.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(
            @RequestBody Student student
    ) {
        return service.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable("email") String email
    ) {
        service.delete(email);
    }
}
