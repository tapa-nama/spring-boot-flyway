package com.thoughtworks.grad.springdemo.domain;

import com.thoughtworks.grad.springdemo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class StudentTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    @Transactional
    void should_create_student_entity_successfully() {
        Student studentA = new Student();
        Student studentB = new Student();
        Student studentC = new Student();

        String studentAName = "zhao";
        studentA.setName(studentAName);
        int studentAAge = 10;
        studentA.setAge(studentAAge);
        double studentAHeight = 150.0;
        studentA.setHeight(studentAHeight);

        String studentBName = "qian";
        studentB.setName(studentBName);
        int studentBAge = 13;
        studentB.setAge(studentBAge);
        double studentBHeight = 170.0;
        studentB.setHeight(studentBHeight);

        String studentCName = "sun";
        studentC.setName(studentCName);
        int studentCAge = 12;
        studentC.setAge(studentCAge);
        double studentCHeight = 165.5;
        studentC.setHeight(studentCHeight);

        studentRepository.save(studentA);
        studentRepository.save(studentB);
        studentRepository.save(studentC);

        List<Student> students = studentRepository.findAll();

        assertThat(students).hasSize(3);
    }
}
