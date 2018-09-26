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

import static org.junit.Assert.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class ClazzTest {
    @Autowired
    private ClazzRepository clazzRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Transactional
    @Test
    void should_create_clazz_entity_successfully() {
        Clazz clazz = new Clazz();
        clazz.setName("classOne");
        clazzRepository.save(clazz);
        assertEquals(1, clazzRepository.findAll().size());
    }

    @Test
    void should_add_students_to_class_and_find_them_all() {
        Clazz clazz1 = new Clazz();
        clazz1.setName("classTwo");
        Clazz clazz2 = clazzRepository.save(clazz1);

        Student student1 = new Student("zhao", 12, 160.0, clazz2);
        Student student2 = new Student("qian", 15, 170.0, clazz2);
        Student student3 = new Student("sun", 17, 180.5, clazz2);

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);


        assertEquals(3, clazzRepository
                .findById(clazz2.getId())
                .get()
                .getStudents()
                .size());

    }
}
