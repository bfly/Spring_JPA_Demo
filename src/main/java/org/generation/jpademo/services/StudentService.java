package org.generation.jpademo.services;

import org.generation.jpademo.entities.Student;
import org.generation.jpademo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;       // Inject repo

    public String getStudents() {
        return String.valueOf(repo.findAll());
    }

    public Student getStudent(Long id) {
        return repo.findById(id).get();
    }

    public Student getStudentByName(String name) {
        return repo.findByName(name);
    }
}
