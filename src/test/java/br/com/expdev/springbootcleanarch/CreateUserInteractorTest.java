package br.com.expdev.springbootcleanarch;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.expdev.springbootcleanarch.application.gateways.UserGateway;
import br.com.expdev.springbootcleanarch.application.usecases.CreateUserInteractor;
import br.com.expdev.springbootcleanarch.domain.entity.User;

public class CreateUserInteractorTest {
    private CreateUserInteractor createUserInteractor;
    private UserGateway userGateway;

    @BeforeEach
    void setUp() {
        userGateway = mock(UserGateway.class);
        createUserInteractor = new CreateUserInteractor(userGateway);
    }

    @Test
    void testCreateUser() {
        User user = new User("testUser", "password123", "test@example.com");
        when(userGateway.createUser(user)).thenReturn(user);

        User createdUser = createUserInteractor.createUser(user);
        assertEquals(user, createdUser);
    }
}