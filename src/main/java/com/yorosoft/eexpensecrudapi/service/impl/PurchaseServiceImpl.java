package com.yorosoft.eexpensecrudapi.service.impl;

import com.yorosoft.eexpensecrudapi.model.Purchase;
import com.yorosoft.eexpensecrudapi.repository.PurchaseRepository;
import com.yorosoft.eexpensecrudapi.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    @Override
    public List<Purchase> findAll() {
        return purchaseRepository.findAll();
    }

    @Override
    public Optional<Purchase> findById(Long id) {
        return purchaseRepository.findById(id);
    }

    @Override
    public Purchase save(Purchase entity) {
        return purchaseRepository.save(entity);
    }

    @Override
    public void delete(Long id) { purchaseRepository.deleteById(id); }

    @Override
    public Purchase update(Purchase entityToUpdate, Purchase entityToSaved) {
        entityToSaved.setName(entityToUpdate.getName());
        entityToSaved.setDescription(entityToUpdate.getDescription());
        entityToSaved.setPrice(entityToUpdate.getPrice());
        entityToSaved.setQuantity(entityToUpdate.getQuantity());
        entityToSaved.setTotal(entityToUpdate.getTotal());
        return purchaseRepository.save(entityToSaved);
    }
}
