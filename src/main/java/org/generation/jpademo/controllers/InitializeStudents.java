package org.generation.jpademo.controllers;

import org.generation.jpademo.entities.Student;
import org.generation.jpademo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class InitializeStudents
        implements CommandLineRunner
{

    @Autowired
    StudentRepo repo;

    // @Override
    public void run(String... args) throws Exception {
        System.out.println("Initialize Students");
        repo.save(new Student(null, "Bill", "wfly@dcccd.edu"));
        repo.save(new Student(null, "Adam", "adam@gmail.com"));
    }
}
