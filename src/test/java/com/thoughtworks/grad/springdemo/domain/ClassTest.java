package com.thoughtworks.grad.springdemo.domain;

import com.thoughtworks.grad.springdemo.repository.ClazzRepository;
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

    @Test
    @Transactional
    void should_create_clazz_entity_successfully() {
        Clazz clazz = new Clazz();
        String clazzName = "classOne";


        clazz.setName(clazzName);

        clazzRepository.save(clazz);
        List<Clazz> clazzes = clazzRepository.findAll();

        assertThat(clazzes).hasSize(1);
        assertEquals("classOne", clazzes.get(0).getName());
    }
}
