package com.yorosoft.eexpensecrudapi.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CategoryResponseDTOTest {
    @Test
    public void testBuilder() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by builder()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        CategoryResponseDTO.builder();
    }

    @Test
    public void testConstructor() {
        CategoryResponseDTO actualCategoryResponseDTO = new CategoryResponseDTO();
        actualCategoryResponseDTO.setName("Name");
        assertEquals("Name", actualCategoryResponseDTO.getName());
    }

    @Test
    public void testConstructor2() {
        CategoryResponseDTO actualCategoryResponseDTO = new CategoryResponseDTO("Name");
        actualCategoryResponseDTO.setName("Name");
        assertEquals("Name", actualCategoryResponseDTO.getName());
    }
}

