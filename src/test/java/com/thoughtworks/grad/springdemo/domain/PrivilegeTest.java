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
public class PrivilegeTest {
    @Test
    void should_map_privilege_entity_correctly() {
        Privilege privilege = new Privilege();
        assertNotNull(privilege);

        int id = privilege.getId();
        assertEquals(0, id);
        assertEquals("t_privilege", privilege.getClass().getAnnotation(Table.class).name());

    }
}
