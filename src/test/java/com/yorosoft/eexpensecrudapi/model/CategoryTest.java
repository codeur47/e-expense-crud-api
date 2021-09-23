package com.yorosoft.eexpensecrudapi.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    @Test
    void testEquals() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(null, category);
    }

    @Test
    void testEquals2() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals("Different type to Category", category);
    }

    @Test
    void testEquals3() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertEquals(category, category);
        int expectedHashCodeResult = category.hashCode();
        assertEquals(expectedHashCodeResult, category.hashCode());
    }

    @Test
    void testEquals4() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Category category1 = new Category();
        category1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setId(123L);
        category1.setName("Name");
        category1.setPurchaseList(new ArrayList<Purchase>());
        category1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertEquals(category, category1);
        int expectedHashCodeResult = category.hashCode();
        assertEquals(expectedHashCodeResult, category1.hashCode());
    }

    @Test
    void testEquals5() {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName(null);
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Category category1 = new Category();
        category1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setId(123L);
        category1.setName("Name");
        category1.setPurchaseList(new ArrayList<Purchase>());
        category1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(category, category1);
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
        purchase.setName("Name");
        purchase.setCategory(category);
        purchase.setPrice(BigDecimal.valueOf(42L));
        purchase.setQuantity(0);
        purchase.setDescription("The characteristics of someone or something");
        purchase.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();
        purchaseList.add(purchase);

        Category category1 = new Category();
        category1.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setId(123L);
        category1.setName("Name");
        category1.setPurchaseList(purchaseList);
        category1.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Category category2 = new Category();
        category2.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category2.setId(123L);
        category2.setName("Name");
        category2.setPurchaseList(new ArrayList<Purchase>());
        category2.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(category1, category2);
    }
}

