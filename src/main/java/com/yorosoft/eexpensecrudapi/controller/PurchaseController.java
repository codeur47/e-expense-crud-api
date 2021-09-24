package com.yorosoft.eexpensecrudapi.controller;

import com.yorosoft.eexpensecrudapi.config.CrudControllerAPIPath;
import com.yorosoft.eexpensecrudapi.dto.PurchaseRequestDTO;
import com.yorosoft.eexpensecrudapi.dto.PurchaseResponseDTO;
import com.yorosoft.eexpensecrudapi.exception.ResourceNotFoundException;
import com.yorosoft.eexpensecrudapi.mapper.PurchaseMapper;
import com.yorosoft.eexpensecrudapi.model.Category;
import com.yorosoft.eexpensecrudapi.model.Purchase;
import com.yorosoft.eexpensecrudapi.service.CategoryService;
import com.yorosoft.eexpensecrudapi.service.PurchaseService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.yorosoft.eexpensecrudapi.config.CrudControllerAPIPath.DELETE_BY_ID;
import static com.yorosoft.eexpensecrudapi.config.CrudControllerAPIPath.GET_BY_ID;

@RestController
@RequestMapping(CrudControllerAPIPath.PURCHASE_BASE_URL)
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;
    private final CategoryService categoryService;
    private final PurchaseMapper purchaseMapper;

    @GetMapping
    @ApiOperation(value = "List all Purchases")
    public ResponseEntity<List<PurchaseResponseDTO>> getAllPurchases() {
        List<PurchaseResponseDTO> purchasesToResponseDtos = purchaseMapper.purchasesToResponseDtos(purchaseService.findAll());
        if (!purchasesToResponseDtos.isEmpty()) {
            return new ResponseEntity<>(purchasesToResponseDtos, HttpStatus.OK);
        } else {
            throw new ResourceNotFoundException();
        }
    }

    @GetMapping(GET_BY_ID)
    @ApiOperation(value = "Get purchase by id")
    public ResponseEntity<PurchaseResponseDTO> getPurchaseById(@PathVariable Long id) {
        Optional<Purchase> optionalPurchase = purchaseService.findById(id);
        return optionalPurchase.map(t ->
                        new ResponseEntity<>(purchaseMapper.purchaseToResponseDto(t), HttpStatus.OK))
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @PostMapping
    @ApiOperation(value = "Create purchase")
    public ResponseEntity<PurchaseResponseDTO> createCategory(@RequestBody PurchaseRequestDTO purchaseRequestDTO) {
        Optional<Category> optionalCategory = categoryService.findById(purchaseRequestDTO.getCategoryId());
        if (optionalCategory.isPresent()) {
            Purchase purchase = purchaseMapper.purchaseRequestDtoToPurchase(purchaseRequestDTO);
            purchase.setCategory(optionalCategory.get());
            return new ResponseEntity<>(purchaseMapper.purchaseToResponseDto(purchaseService.save(purchase)), HttpStatus.CREATED);
        }else
            throw new ResourceNotFoundException(purchaseRequestDTO.getCategoryId());
    }

    @DeleteMapping(DELETE_BY_ID)
    @ApiOperation(value = "Delete purchase by Id")
    public ResponseEntity<String> delete(@PathVariable Long id){
        Optional<Purchase> optional = purchaseService.findById(id);

        return optional.map(t ->
                        new ResponseEntity<>("Purchase with the id " + id + " was deleted.", HttpStatus.NO_CONTENT))
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @PutMapping
    @ApiOperation(value = "Update category")
    public ResponseEntity<String> update(@RequestBody PurchaseRequestDTO purchaseRequestDTOToUpdate){

        Optional<Category> optionalCategory = categoryService.findById(purchaseRequestDTOToUpdate.getCategoryId());
        Optional<Purchase> optionalPurchaseToSaved = purchaseService.findById(purchaseRequestDTOToUpdate.getId());

        if (optionalPurchaseToSaved.isPresent()){
            optionalCategory.ifPresent(category -> optionalPurchaseToSaved.get().setCategory(category));
            purchaseService.update(purchaseMapper.purchaseRequestDtoToPurchase(purchaseRequestDTOToUpdate), optionalPurchaseToSaved.get());
            return new ResponseEntity<>("Category with id " + purchaseRequestDTOToUpdate.getId() + " was updated.", HttpStatus.OK);
        }else
            throw new ResourceNotFoundException(purchaseRequestDTOToUpdate.getId());
    }
}
