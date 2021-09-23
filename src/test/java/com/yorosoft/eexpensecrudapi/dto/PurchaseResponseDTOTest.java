package com.yorosoft.eexpensecrudapi.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class PurchaseResponseDTOTest {
    @Test
    public void testBuilder() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by builder()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        PurchaseResponseDTO.builder();
    }

    @Test
    public void testConstructor() {
        PurchaseResponseDTO actualPurchaseResponseDTO = new PurchaseResponseDTO();
        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO("Name");
        actualPurchaseResponseDTO.setCategoryResponseDTO(categoryResponseDTO);
        actualPurchaseResponseDTO.setDescription("The characteristics of someone or something");
        actualPurchaseResponseDTO.setName("Name");
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        actualPurchaseResponseDTO.setPrice(valueOfResult);
        actualPurchaseResponseDTO.setQuantity(1);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        actualPurchaseResponseDTO.setTotal(valueOfResult1);
        assertSame(categoryResponseDTO, actualPurchaseResponseDTO.getCategoryResponseDTO());
        assertEquals("The characteristics of someone or something", actualPurchaseResponseDTO.getDescription());
        assertEquals("Name", actualPurchaseResponseDTO.getName());
        BigDecimal price = actualPurchaseResponseDTO.getPrice();
        assertSame(valueOfResult, price);
        BigDecimal total = actualPurchaseResponseDTO.getTotal();
        assertEquals(total, price);
        assertEquals(1, actualPurchaseResponseDTO.getQuantity());
        assertSame(valueOfResult1, total);
        assertEquals(valueOfResult, total);
    }

    @Test
    public void testConstructor2() {
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        PurchaseResponseDTO actualPurchaseResponseDTO = new PurchaseResponseDTO("Name",
                "The characteristics of someone or something", valueOfResult, 1, valueOfResult1,
                new CategoryResponseDTO("Name"));
        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO("Name");
        actualPurchaseResponseDTO.setCategoryResponseDTO(categoryResponseDTO);
        actualPurchaseResponseDTO.setDescription("The characteristics of someone or something");
        actualPurchaseResponseDTO.setName("Name");
        BigDecimal valueOfResult2 = BigDecimal.valueOf(42L);
        actualPurchaseResponseDTO.setPrice(valueOfResult2);
        actualPurchaseResponseDTO.setQuantity(1);
        BigDecimal valueOfResult3 = BigDecimal.valueOf(42L);
        actualPurchaseResponseDTO.setTotal(valueOfResult3);
        assertSame(categoryResponseDTO, actualPurchaseResponseDTO.getCategoryResponseDTO());
        assertEquals("The characteristics of someone or something", actualPurchaseResponseDTO.getDescription());
        assertEquals("Name", actualPurchaseResponseDTO.getName());
        BigDecimal price = actualPurchaseResponseDTO.getPrice();
        assertSame(valueOfResult2, price);
        BigDecimal total = actualPurchaseResponseDTO.getTotal();
        assertEquals(total, price);
        assertEquals(valueOfResult1, price);
        assertEquals(valueOfResult, price);
        assertEquals(1, actualPurchaseResponseDTO.getQuantity());
        assertSame(valueOfResult3, total);
        assertEquals(valueOfResult2, total);
        assertEquals(valueOfResult1, total);
        assertEquals(valueOfResult, total);
    }
}

