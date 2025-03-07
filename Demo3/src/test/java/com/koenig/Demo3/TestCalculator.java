package com.koenig.Demo3;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class TestCalculator {

    private Calculator c;
    
    @Mock
    private CalculatorService service;
    
    @Before
    public void setup() {
        c = new Calculator(service);
    }
    
    @Test
    public void testPerform() {
        // Arrange
        when(service.add(2, 3)).thenReturn(5); // Mocking the add method
        
        // Act
        int result = c.perform(2, 3);
        
        // Assert
        assertEquals(10, result); // (2+3) * 2 = 10
        
        // Verify that the mock method was called correctly
        verify(service).add(2, 3);
    }
}
