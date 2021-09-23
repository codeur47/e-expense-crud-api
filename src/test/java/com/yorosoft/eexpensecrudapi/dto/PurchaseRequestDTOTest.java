package com.yorosoft.eexpensecrudapi.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class PurchaseRequestDTOTest {
    @Test
    public void testBuilder() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by builder()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        PurchaseRequestDTO.builder();
    }

    @Test
    public void testConstructor() {
        PurchaseRequestDTO actualPurchaseRequestDTO = new PurchaseRequestDTO();
        actualPurchaseRequestDTO.setCategoryId(123L);
        actualPurchaseRequestDTO.setDescription("The characteristics of someone or something");
        actualPurchaseRequestDTO.setName("Name");
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        actualPurchaseRequestDTO.setPrice(valueOfResult);
        actualPurchaseRequestDTO.setQuantity(1);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        actualPurchaseRequestDTO.setTotal(valueOfResult1);
        assertEquals(123L, actualPurchaseRequestDTO.getCategoryId().longValue());
        assertEquals("The characteristics of someone or something", actualPurchaseRequestDTO.getDescription());
        assertEquals("Name", actualPurchaseRequestDTO.getName());
        BigDecimal price = actualPurchaseRequestDTO.getPrice();
        assertSame(valueOfResult, price);
        BigDecimal total = actualPurchaseRequestDTO.getTotal();
        assertEquals(total, price);
        assertEquals(1, actualPurchaseRequestDTO.getQuantity());
        assertSame(valueOfResult1, total);
        assertEquals(valueOfResult, total);
    }

    @Test
    public void testConstructor2() {
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        PurchaseRequestDTO actualPurchaseRequestDTO = new PurchaseRequestDTO("Name",
                "The characteristics of someone or something", valueOfResult, 1, valueOfResult1, 123L);
        actualPurchaseRequestDTO.setCategoryId(123L);
        actualPurchaseRequestDTO.setDescription("The characteristics of someone or something");
        actualPurchaseRequestDTO.setName("Name");
        BigDecimal valueOfResult2 = BigDecimal.valueOf(42L);
        actualPurchaseRequestDTO.setPrice(valueOfResult2);
        actualPurchaseRequestDTO.setQuantity(1);
        BigDecimal valueOfResult3 = BigDecimal.valueOf(42L);
        actualPurchaseRequestDTO.setTotal(valueOfResult3);
        assertEquals(123L, actualPurchaseRequestDTO.getCategoryId().longValue());
        assertEquals("The characteristics of someone or something", actualPurchaseRequestDTO.getDescription());
        assertEquals("Name", actualPurchaseRequestDTO.getName());
        BigDecimal price = actualPurchaseRequestDTO.getPrice();
        assertSame(valueOfResult2, price);
        BigDecimal total = actualPurchaseRequestDTO.getTotal();
        assertEquals(total, price);
        assertEquals(valueOfResult, price);
        assertEquals(valueOfResult1, price);
        assertEquals(1, actualPurchaseRequestDTO.getQuantity());
        assertSame(valueOfResult3, total);
        assertEquals(valueOfResult2, total);
        assertEquals(valueOfResult, total);
        assertEquals(valueOfResult1, total);
    }
}

