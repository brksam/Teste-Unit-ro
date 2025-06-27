package com.exemplo.service;

import com.exemplo.model.User;
import com.exemplo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        User user = new User();
        user.setName("João");
        when(userRepository.findAll()).thenReturn(Arrays.asList(user));

        List<User> users = userService.findAll();
        assertEquals(1, users.size());
        assertEquals("João", users.get(0).getName());
    }

    @Test
    void testSave() {
        User user = new User();
        user.setName("Maria");
        when(userRepository.save(user)).thenReturn(user);

        User saved = userService.save(user);
        assertEquals("Maria", saved.getName());
    }
} 