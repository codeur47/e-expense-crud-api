package com.yorosoft.eexpensecrudapi.mapper;

import com.yorosoft.eexpensecrudapi.dto.PurchaseRequestDTO;
import com.yorosoft.eexpensecrudapi.dto.PurchaseResponseDTO;
import com.yorosoft.eexpensecrudapi.model.Purchase;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    PurchaseRequestDTO purchaseToPurchaseRequestDTO(Purchase purchase);
    Purchase purchaseRequestDtoToPurchase(PurchaseRequestDTO categoryRequestDTO);

    PurchaseResponseDTO purchaseToResponseDto(Purchase purchase);
    List<PurchaseResponseDTO> purchasesToResponseDtos(List<Purchase> purchases);
}
