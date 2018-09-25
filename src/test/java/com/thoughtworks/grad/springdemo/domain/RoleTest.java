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
class RoleTest {

    @Test
    void should_map_role_entity_correctly() {
        Role role = new Role();
        assertNotNull(role);

        int id = role.getId();
        assertEquals(0, id);
        assertEquals("t_role", role.getClass().getAnnotation(Table.class).name());
    }
}
