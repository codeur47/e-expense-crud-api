package com.yorosoft.eexpensecrudapi.mapper;

import com.yorosoft.eexpensecrudapi.dto.CategoryRequestDTO;
import com.yorosoft.eexpensecrudapi.dto.CategoryResponseDTO;
import com.yorosoft.eexpensecrudapi.model.Category;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryRequestDTO categoryToRequestDto(Category category);
    Category requestDtoToCategory(CategoryRequestDTO categoryRequestDTO);

    List<CategoryResponseDTO> categoriesToResponseDtos(List<Category> categories);

    CategoryResponseDTO categoryToResponseDto(Category category);
}
