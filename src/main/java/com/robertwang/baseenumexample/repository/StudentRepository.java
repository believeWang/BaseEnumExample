package com.robertwang.baseenumexample.repository;

import com.robertwang.baseenumexample.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {}
