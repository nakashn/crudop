package com.curdop.curd.operation.service;

import com.curdop.curd.operation.entites.Student;
import com.curdop.curd.operation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceimple implements StudentService {
    @Autowired
   private StudentRepository studentRepository;

//    for saving
    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
//    read all
    @Override
    public List<Student> seeStudentList(){
        return (List<Student>) studentRepository.findAll();
    }
//update
    public Student updateStudent(Student student ,long StudentId){
        Student stu = studentRepository.findById(StudentId).get();


}
