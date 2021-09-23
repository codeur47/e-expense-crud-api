package com.yorosoft.eexpensecrudapi.advice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.yorosoft.eexpensecrudapi.exception.ResourceNotFoundException;
import org.junit.jupiter.api.Test;

class GlobalAdviceTest {
    @Test
    void testResourceNotFoundHandler() {
        GlobalAdvice globalAdvice = new GlobalAdvice();
        assertEquals("Could not find resource.", globalAdvice.resourceNotFoundHandler(new ResourceNotFoundException()));
    }

    @Test
    void testResourceNotFoundHandler2() {
        GlobalAdvice globalAdvice = new GlobalAdvice();

        ResourceNotFoundException resourceNotFoundException = new ResourceNotFoundException();
        resourceNotFoundException.addSuppressed(new Throwable());
        assertEquals("Could not find resource.", globalAdvice.resourceNotFoundHandler(resourceNotFoundException));
    }
}

