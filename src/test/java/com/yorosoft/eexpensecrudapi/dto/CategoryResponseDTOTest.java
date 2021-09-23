package com.yorosoft.eexpensecrudapi.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CategoryResponseDTOTest {
    @Test
    void testBuilder() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by builder()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        assertTrue(true);

        CategoryResponseDTO.builder();
    }

    @Test
    void testConstructor() {
        CategoryResponseDTO actualCategoryResponseDTO = new CategoryResponseDTO();
        actualCategoryResponseDTO.setName("Name");
        assertEquals("Name", actualCategoryResponseDTO.getName());
    }

    @Test
    void testConstructor2() {
        CategoryResponseDTO actualCategoryResponseDTO = new CategoryResponseDTO("Name");
        actualCategoryResponseDTO.setName("Name");
        assertEquals("Name", actualCategoryResponseDTO.getName());
    }
}

