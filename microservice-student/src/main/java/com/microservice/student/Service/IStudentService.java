package com.microservice.student.Service;

import com.microservice.student.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    List<Student> findByIdCurse(Long idCourse);

}
