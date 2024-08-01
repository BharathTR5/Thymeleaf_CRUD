package com.CRUD.sboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.sboot.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
