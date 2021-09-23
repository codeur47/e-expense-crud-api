package com.yorosoft.eexpensecrudapi.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CategoryRequestDTOTest {
    @Test
    public void testBuilder() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by builder()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        CategoryRequestDTO.builder();
    }

    @Test
    public void testConstructor() {
        CategoryRequestDTO actualCategoryRequestDTO = new CategoryRequestDTO();
        actualCategoryRequestDTO.setName("Name");
        assertEquals("Name", actualCategoryRequestDTO.getName());
    }

    @Test
    public void testConstructor2() {
        CategoryRequestDTO actualCategoryRequestDTO = new CategoryRequestDTO("Name");
        actualCategoryRequestDTO.setName("Name");
        assertEquals("Name", actualCategoryRequestDTO.getName());
    }
}

