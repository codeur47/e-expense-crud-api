package com.yorosoft.eexpensecrudapi.service.impl;

import com.yorosoft.eexpensecrudapi.model.Purchase;
import com.yorosoft.eexpensecrudapi.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseServiceImpl implements PurchaseService {


    @Override
    public List<Purchase> findAll() {
        return null;
    }

    @Override
    public Optional<Purchase> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Purchase save(Purchase entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Purchase update(Long id, Purchase entity) {
        return null;
    }
}
