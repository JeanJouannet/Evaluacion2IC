package com.example.evaluacion2iciplacex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import com.example.evaluacion2iciplacex.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class DatabaseConnectionTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        assertDoesNotThrow(() -> {
            long userCount = userRepository.count();
        });
    }
}

