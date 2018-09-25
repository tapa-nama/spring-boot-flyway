package com.thoughtworks.grad.springdemo.repository;

import com.thoughtworks.grad.springdemo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
