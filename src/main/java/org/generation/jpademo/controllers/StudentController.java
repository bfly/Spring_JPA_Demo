package org.generation.jpademo.controllers;

import org.generation.jpademo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public String listStudents() {
        return service.getStudents();
    }

    @GetMapping("/student")
    public String getStudent(@RequestParam(value="id", name="id") Long id) {
        return service.getStudent(id).toString();
    }

    @GetMapping("/name")
    public String getByName(@RequestParam(value="name", name="name") String name) { return service.getStudentByName(name).toString();}
}
