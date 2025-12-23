package com.curdop.curd.operation.repository;

import com.curdop.curd.operation.entites.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
