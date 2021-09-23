package com.yorosoft.eexpensecrudapi.service;

import com.yorosoft.eexpensecrudapi.model.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface CrudService<T extends BaseEntity> {

    List<T> findAll();

    Optional<T> findById(Long id);

    T save(T entity);

    void delete(Long id);

    T update(T entityToUpdate, T entityToSaved);

}
