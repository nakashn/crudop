package com.curdop.curd.operation.service;


import com.curdop.curd.operation.entites.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> seeStudentList();
    Student updateStudent(Student student , Long StudentId);
    void deletestubyid(Long StudentId);
}
