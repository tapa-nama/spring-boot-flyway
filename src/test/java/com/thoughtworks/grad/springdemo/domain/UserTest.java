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
class UserTest {

    User user = new User();


    @Test
    void should_map_user_entity_correctly() {

        assertNotNull(user);

        int id = user.getId();
        assertEquals(0, id);

        assertEquals("t_user", User.class.getAnnotation(Table.class).name());
        assertEquals("t_role", Role.class.getAnnotation(Table.class).name());
        assertEquals("t_privilege", Privilege.class.getAnnotation(Table.class).name());

    }

//    @Test
//    void should_map_relationship_between_user_and_role_entity_correctly() throws NoSuchFieldException {
//        Field[] fields = User.class.getFields();
//        for (Field field : fields) {
//field.getAnnotatedType();
//        }
//        boolean result = false;
//        for (Annotation annotation : annotations) {
//            if (annotation.annotationType().equals(OneToOne.class)) {
//                result = true;
//            }
//
//        }
//
//        assertTrue(result);
//        assertEquals("OneToOne", User.class.getField("role").
//                getAnnotations().getClass().getSimpleName());
//    }


}
