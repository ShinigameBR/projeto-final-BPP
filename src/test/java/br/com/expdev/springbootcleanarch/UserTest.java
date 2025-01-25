package br.com.expdev.springbootcleanarch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import br.com.expdev.springbootcleanarch.domain.entity.User;

public class UserTest {
    @Test
    void testUserCreation() {
        User user = new User("testUser", "password123", "test@example.com");
        assertEquals("testUser", user.username());
        assertEquals("password123", user.password());
        assertEquals("test@example.com", user.email());
    }
}
