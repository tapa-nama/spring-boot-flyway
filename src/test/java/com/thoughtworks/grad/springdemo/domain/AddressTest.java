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
class AddressTest {
    @Test
    void should_map_address_entity_correctly() {

        Address address = new Address();
        assertNotNull(address);

        int id = address.getId();
        assertEquals(0, id);

        assertEquals("t_address", Address.class.getAnnotation(Table.class).name());

    }

    @Test
    void should_map_many_addresses_to_one_user_correctly() {

    }
}
