package com.thoughtworks.grad.springdemo.domain;

import com.thoughtworks.grad.springdemo.repository.ClazzRepository;
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
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
class ClassTest {
    @Autowired
    private ClazzRepository clazzRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    @Transactional
    void should_create_clazz_entity_successfully() {
        Clazz clazz = new Clazz();
        clazz.setName("classOne");

        clazzRepository.save(clazz);
        List<Clazz> clazzes = clazzRepository.findAll();

        assertThat(clazzes).hasSize(1);
        assertEquals("classOne", clazzes.get(0).getName());
    }


    @Test
    @Transactional
    void should_find_student_from_clazz() {
        Clazz clazz = new Clazz();
        clazz.setName("classTwo");


        Student studentA = new Student();
        Student studentB = new Student();
        Student studentC = new Student();

        studentA.setName("zhou");
        studentA.setAge(10);
        studentA.setHeight(150.0);

        studentB.setName("wu");
        studentB.setAge(13);
        studentB.setHeight(170.0);

        studentC.setName("zheng");
        studentC.setAge(12);
        studentC.setHeight(165.5);

        studentRepository.save(studentA);
        studentRepository.save(studentB);
        studentRepository.save(studentC);


        List<Student> students = studentRepository.findAll();
        clazz.setStudents(students);
        clazzRepository.save(clazz);

        List<Clazz> clazzes = clazzRepository.findAll();
        assertEquals(3, clazzes.get(0).getStudents().size());
        assertEquals("zhou", clazzes.get(0).getStudents().get(0).getName());


    }
}
