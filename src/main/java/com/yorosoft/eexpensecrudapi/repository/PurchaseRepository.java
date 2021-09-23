package com.yorosoft.eexpensecrudapi.repository;

import com.yorosoft.eexpensecrudapi.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> { }
