package com.yorosoft.eexpensecrudapi.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.yorosoft.eexpensecrudapi.model.Category;
import com.yorosoft.eexpensecrudapi.model.Purchase;
import com.yorosoft.eexpensecrudapi.repository.PurchaseRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {PurchaseServiceImpl.class})
@ExtendWith(SpringExtension.class)
class PurchaseServiceImplTest {
    @MockBean
    private PurchaseRepository purchaseRepository;

    @Autowired
    private PurchaseServiceImpl purchaseServiceImpl;

    @Test
    void testFindAll() {
        ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();
        when(this.purchaseRepository.findAll()).thenReturn(purchaseList);
        List<Purchase> actualFindAllResult = this.purchaseServiceImpl.findAll();
        assertSame(purchaseList, actualFindAllResult);
        assertTrue(actualFindAllResult.isEmpty());
        verify(this.purchaseRepository).findAll();
    }

    @Test
    void testFindAll2() {
        ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();
        when(this.purchaseRepository.findAll()).thenReturn(purchaseList);
        List<Purchase> actualFindAllResult = this.purchaseServiceImpl.findAll();
        assertSame(purchaseList, actualFindAllResult);
        assertTrue(actualFindAllResult.isEmpty());
        verify(this.purchaseRepository).findAll();
    }

    @Test
    void testFindAll3() {
        ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();
        when(this.purchaseRepository.findAll()).thenReturn(purchaseList);
        List<Purchase> actualFindAllResult = this.purchaseServiceImpl.findAll();
        assertSame(purchaseList, actualFindAllResult);
        assertTrue(actualFindAllResult.isEmpty());
        verify(this.purchaseRepository).findAll();
    }

    @Test
    void testFindById() {
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
        Optional<Purchase> ofResult = Optional.<Purchase>of(purchase);
        when(this.purchaseRepository.findById((Long) any())).thenReturn(ofResult);
        Optional<Purchase> actualFindByIdResult = this.purchaseServiceImpl.findById(123L);
        assertSame(ofResult, actualFindByIdResult);
        assertTrue(actualFindByIdResult.isPresent());
        Purchase getResult = actualFindByIdResult.get();
        assertEquals("42", getResult.getPrice().toString());
        assertEquals("42", getResult.getTotal().toString());
        verify(this.purchaseRepository).findById((Long) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testFindById2() {
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
        Optional<Purchase> ofResult = Optional.<Purchase>of(purchase);
        when(this.purchaseRepository.findById((Long) any())).thenReturn(ofResult);
        Optional<Purchase> actualFindByIdResult = this.purchaseServiceImpl.findById(123L);
        assertSame(ofResult, actualFindByIdResult);
        assertTrue(actualFindByIdResult.isPresent());
        Purchase getResult = actualFindByIdResult.get();
        assertEquals("42", getResult.getPrice().toString());
        assertEquals("42", getResult.getTotal().toString());
        verify(this.purchaseRepository).findById((Long) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testFindById3() {
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
        Optional<Purchase> ofResult = Optional.<Purchase>of(purchase);
        when(this.purchaseRepository.findById((Long) any())).thenReturn(ofResult);
        Optional<Purchase> actualFindByIdResult = this.purchaseServiceImpl.findById(123L);
        assertSame(ofResult, actualFindByIdResult);
        assertTrue(actualFindByIdResult.isPresent());
        Purchase getResult = actualFindByIdResult.get();
        assertEquals("42", getResult.getPrice().toString());
        assertEquals("42", getResult.getTotal().toString());
        verify(this.purchaseRepository).findById((Long) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testSave() {
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
        when(this.purchaseRepository.save((Purchase) any())).thenReturn(purchase);

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
        Purchase actualSaveResult = this.purchaseServiceImpl.save(purchase1);
        assertSame(purchase, actualSaveResult);
        assertEquals("42", actualSaveResult.getPrice().toString());
        assertEquals("42", actualSaveResult.getTotal().toString());
        verify(this.purchaseRepository).save((Purchase) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testSave2() {
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
        when(this.purchaseRepository.save((Purchase) any())).thenReturn(purchase);

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
        Purchase actualSaveResult = this.purchaseServiceImpl.save(purchase1);
        assertSame(purchase, actualSaveResult);
        assertEquals("42", actualSaveResult.getPrice().toString());
        assertEquals("42", actualSaveResult.getTotal().toString());
        verify(this.purchaseRepository).save((Purchase) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testSave3() {
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
        when(this.purchaseRepository.save((Purchase) any())).thenReturn(purchase);

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
        Purchase actualSaveResult = this.purchaseServiceImpl.save(purchase1);
        assertSame(purchase, actualSaveResult);
        assertEquals("42", actualSaveResult.getPrice().toString());
        assertEquals("42", actualSaveResult.getTotal().toString());
        verify(this.purchaseRepository).save((Purchase) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testDelete() {
        doNothing().when(this.purchaseRepository).deleteById((Long) any());
        this.purchaseServiceImpl.delete(123L);
        verify(this.purchaseRepository).deleteById((Long) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testDelete2() {
        doNothing().when(this.purchaseRepository).deleteById((Long) any());
        this.purchaseServiceImpl.delete(123L);
        verify(this.purchaseRepository).deleteById((Long) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testDelete3() {
        doNothing().when(this.purchaseRepository).deleteById((Long) any());
        this.purchaseServiceImpl.delete(123L);
        verify(this.purchaseRepository).deleteById((Long) any());
        assertTrue(this.purchaseServiceImpl.findAll().isEmpty());
    }

    @Test
    void testUpdate() {
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
        when(this.purchaseRepository.save((Purchase) any())).thenReturn(purchase);

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

        Category category2 = new Category();
        category2.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category2.setId(123L);
        category2.setName("Name");
        category2.setPurchaseList(new ArrayList<Purchase>());
        category2.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase2 = new Purchase();
        purchase2.setTotal(BigDecimal.valueOf(42L));
        purchase2.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase2.setId(123L);
        purchase2.setName("Name");
        purchase2.setCategory(category2);
        purchase2.setPrice(BigDecimal.valueOf(42L));
        purchase2.setQuantity(1);
        purchase2.setDescription("The characteristics of someone or something");
        purchase2.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        Purchase actualUpdateResult = this.purchaseServiceImpl.update(purchase1, purchase2);
        assertSame(purchase, actualUpdateResult);
        assertEquals("42", actualUpdateResult.getPrice().toString());
        assertEquals("42", actualUpdateResult.getTotal().toString());
        verify(this.purchaseRepository).save((Purchase) any());
        BigDecimal expectedPrice = purchase1.getPrice();
        assertSame(expectedPrice, purchase2.getPrice());
        assertEquals("Name", purchase2.getName());
        assertEquals("The characteristics of someone or something", purchase2.getDescription());
    }

    @Test
    void testUpdate2() {
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
        when(this.purchaseRepository.save((Purchase) any())).thenReturn(purchase);

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

        Category category2 = new Category();
        category2.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category2.setId(123L);
        category2.setName("Name");
        category2.setPurchaseList(new ArrayList<Purchase>());
        category2.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase2 = new Purchase();
        purchase2.setTotal(BigDecimal.valueOf(42L));
        purchase2.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase2.setId(123L);
        purchase2.setName("Name");
        purchase2.setCategory(category2);
        purchase2.setPrice(BigDecimal.valueOf(42L));
        purchase2.setQuantity(1);
        purchase2.setDescription("The characteristics of someone or something");
        purchase2.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        Purchase actualUpdateResult = this.purchaseServiceImpl.update(purchase1, purchase2);
        assertSame(purchase, actualUpdateResult);
        assertEquals("42", actualUpdateResult.getPrice().toString());
        assertEquals("42", actualUpdateResult.getTotal().toString());
        verify(this.purchaseRepository).save((Purchase) any());
        BigDecimal expectedPrice = purchase1.getPrice();
        assertSame(expectedPrice, purchase2.getPrice());
        assertEquals("Name", purchase2.getName());
        assertEquals("The characteristics of someone or something", purchase2.getDescription());
    }

    @Test
    void testUpdate3() {
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
        when(this.purchaseRepository.save((Purchase) any())).thenReturn(purchase);

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

        Category category2 = new Category();
        category2.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category2.setId(123L);
        category2.setName("Name");
        category2.setPurchaseList(new ArrayList<Purchase>());
        category2.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));

        Purchase purchase2 = new Purchase();
        purchase2.setTotal(BigDecimal.valueOf(42L));
        purchase2.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        purchase2.setId(123L);
        purchase2.setName("Name");
        purchase2.setCategory(category2);
        purchase2.setPrice(BigDecimal.valueOf(42L));
        purchase2.setQuantity(1);
        purchase2.setDescription("The characteristics of someone or something");
        purchase2.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        Purchase actualUpdateResult = this.purchaseServiceImpl.update(purchase1, purchase2);
        assertSame(purchase, actualUpdateResult);
        assertEquals("42", actualUpdateResult.getPrice().toString());
        assertEquals("42", actualUpdateResult.getTotal().toString());
        verify(this.purchaseRepository).save((Purchase) any());
        BigDecimal expectedPrice = purchase1.getPrice();
        assertSame(expectedPrice, purchase2.getPrice());
        assertEquals("Name", purchase2.getName());
        assertEquals("The characteristics of someone or something", purchase2.getDescription());
    }
}

