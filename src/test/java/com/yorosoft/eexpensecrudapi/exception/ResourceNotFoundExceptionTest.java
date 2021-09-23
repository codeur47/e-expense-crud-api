package com.yorosoft.eexpensecrudapi.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class ResourceNotFoundExceptionTest {
    @Test
    public void testConstructor() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException();
        assertNull(actualResourceNotFoundException.getCause());
        assertEquals("com.yorosoft.eexpensecrudapi.exception.ResourceNotFoundException: Could not find resource.",
                actualResourceNotFoundException.toString());
        assertEquals(0, actualResourceNotFoundException.getSuppressed().length);
        assertEquals("Could not find resource.", actualResourceNotFoundException.getMessage());
        assertEquals("Could not find resource.", actualResourceNotFoundException.getLocalizedMessage());
    }

    @Test
    public void testConstructor2() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException(123L);
        assertNull(actualResourceNotFoundException.getCause());
        assertEquals("com.yorosoft.eexpensecrudapi.exception.ResourceNotFoundException: Could not find resource 123.",
                actualResourceNotFoundException.toString());
        assertEquals(0, actualResourceNotFoundException.getSuppressed().length);
        assertEquals("Could not find resource 123.", actualResourceNotFoundException.getMessage());
        assertEquals("Could not find resource 123.", actualResourceNotFoundException.getLocalizedMessage());
    }
}

