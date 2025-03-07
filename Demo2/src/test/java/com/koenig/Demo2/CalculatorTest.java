package com.koenig.Demo2;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CalculatorTest {
    
    @Mock
    CalculatorService service; // Mocking the dependency
    
    @InjectMocks
    Calculator calculator; // Injecting the mock into Calculator
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }
    
    @Test
    void testPerform() {
        // Arrange
        when(service.add(2, 3)).thenReturn(5); // Stubbing method call
        
        // Act
        int result = calculator.perform(2, 3);
        
        // Assert
        assertEquals(10, result); // (2+3) * 2 = 10
        
        // Verify that the mock method was called with expected arguments
        verify(service).add(2, 3);
    }
}
