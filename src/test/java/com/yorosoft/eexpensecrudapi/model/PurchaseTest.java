package com.yorosoft.eexpensecrudapi.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {
    @Test
    void testEquals() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase = new Purchase();
        purchase.setTotal(BigDecimal.valueOf(42L));
        purchase.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase.setId(123L);
        purchase.setName("Name");
        purchase.setCategory(category);
        purchase.setPrice(BigDecimal.valueOf(42L));
        purchase.setQuantity(1);
        purchase.setDescription("The characteristics of someone or something");
        purchase.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotNull(purchase);
    }

    @Test
    void testEquals2() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase = new Purchase();
        purchase.setTotal(BigDecimal.valueOf(42L));
        purchase.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase.setId(123L);
        purchase.setName("Name");
        purchase.setCategory(category);
        purchase.setPrice(BigDecimal.valueOf(42L));
        purchase.setQuantity(1);
        purchase.setDescription("The characteristics of someone or something");
        purchase.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertFalse(purchase.equals("Different type to Purchase"));
    }

    @Test
    void testEquals3() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase = new Purchase();
        purchase.setTotal(BigDecimal.valueOf(42L));
        purchase.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase.setId(123L);
        purchase.setName("Name");
        purchase.setCategory(category);
        purchase.setPrice(BigDecimal.valueOf(42L));
        purchase.setQuantity(1);
        purchase.setDescription("The characteristics of someone or something");
        purchase.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertEquals(purchase, purchase);
        int expectedHashCodeResult = purchase.hashCode();
        assertEquals(expectedHashCodeResult, purchase.hashCode());
    }

    @Test
    void testEquals4() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase = new Purchase();
        purchase.setTotal(BigDecimal.valueOf(42L));
        purchase.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase.setId(123L);
        purchase.setName("Name");
        purchase.setCategory(category);
        purchase.setPrice(BigDecimal.valueOf(42L));
        purchase.setQuantity(1);
        purchase.setDescription("The characteristics of someone or something");
        purchase.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Category category1 = new Category();
        category1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setId(123L);
        category1.setName("Name");
        category1.setPurchaseList(new ArrayList<Purchase>());
        category1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase1 = new Purchase();
        purchase1.setTotal(BigDecimal.valueOf(42L));
        purchase1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase1.setId(123L);
        purchase1.setName("Name");
        purchase1.setCategory(category1);
        purchase1.setPrice(BigDecimal.valueOf(42L));
        purchase1.setQuantity(1);
        purchase1.setDescription("The characteristics of someone or something");
        purchase1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertEquals(purchase, purchase1);
        int expectedHashCodeResult = purchase.hashCode();
        assertEquals(expectedHashCodeResult, purchase1.hashCode());
    }

    @Test
    void testEquals5() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase = new Purchase();
        purchase.setTotal(BigDecimal.valueOf(0L));
        purchase.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase.setId(123L);
        purchase.setName("Name");
        purchase.setCategory(category);
        purchase.setPrice(BigDecimal.valueOf(42L));
        purchase.setQuantity(1);
        purchase.setDescription("The characteristics of someone or something");
        purchase.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Category category1 = new Category();
        category1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setId(123L);
        category1.setName("Name");
        category1.setPurchaseList(new ArrayList<Purchase>());
        category1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase1 = new Purchase();
        purchase1.setTotal(BigDecimal.valueOf(42L));
        purchase1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase1.setId(123L);
        purchase1.setName("Name");
        purchase1.setCategory(category1);
        purchase1.setPrice(BigDecimal.valueOf(42L));
        purchase1.setQuantity(1);
        purchase1.setDescription("The characteristics of someone or something");
        purchase1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(purchase, purchase1);
    }

    @Test
    void testEquals6() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase = new Purchase();
        purchase.setTotal(BigDecimal.valueOf(42L));
        purchase.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase.setId(123L);
        purchase.setName(null);
        purchase.setCategory(category);
        purchase.setPrice(BigDecimal.valueOf(42L));
        purchase.setQuantity(1);
        purchase.setDescription("The characteristics of someone or something");
        purchase.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Category category1 = new Category();
        category1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setId(123L);
        category1.setName("Name");
        category1.setPurchaseList(new ArrayList<Purchase>());
        category1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase1 = new Purchase();
        purchase1.setTotal(BigDecimal.valueOf(42L));
        purchase1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase1.setId(123L);
        purchase1.setName("Name");
        purchase1.setCategory(category1);
        purchase1.setPrice(BigDecimal.valueOf(42L));
        purchase1.setQuantity(1);
        purchase1.setDescription("The characteristics of someone or something");
        purchase1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(purchase, purchase1);
    }
}

