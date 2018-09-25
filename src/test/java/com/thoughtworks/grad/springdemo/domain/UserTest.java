package com.thoughtworks.grad.springdemo.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.Table;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTest {
    @Test
    void should_map_user_entity_correctly() {
        User user = new User();

        assertNotNull(user);

        int id = user.getId();
        assertEquals(0, id);
        assertEquals("t_user", user.getClass().getAnnotation(Table.class).name());
    }


}
