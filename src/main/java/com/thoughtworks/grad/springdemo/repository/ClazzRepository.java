package com.thoughtworks.grad.springdemo.repository;

import com.thoughtworks.grad.springdemo.domain.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClazzRepository extends JpaRepository<Clazz, Integer> {
}
