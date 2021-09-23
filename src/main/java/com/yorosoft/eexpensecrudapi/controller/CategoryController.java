package com.yorosoft.eexpensecrudapi.controller;

import com.yorosoft.eexpensecrudapi.config.CrudControllerAPIPath;
import com.yorosoft.eexpensecrudapi.dto.CategoryRequestDTO;
import com.yorosoft.eexpensecrudapi.dto.CategoryResponseDTO;
import com.yorosoft.eexpensecrudapi.exception.ResourceNotFoundException;
import com.yorosoft.eexpensecrudapi.mapper.CategoryMapper;
import com.yorosoft.eexpensecrudapi.model.Category;
import com.yorosoft.eexpensecrudapi.service.CategoryService;
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
@RequestMapping(CrudControllerAPIPath.CATEGORY_BASE_URL)
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @GetMapping
    @ApiOperation(value = "List all Categories")
    public ResponseEntity<List<CategoryResponseDTO>> getAllCategories() {
        List<CategoryResponseDTO> categoryResponseDTOS = categoryMapper.categoriesToResponseDtos(categoryService.findAll());
        if (!categoryResponseDTOS.isEmpty()) {
            return new ResponseEntity<>(categoryResponseDTOS, HttpStatus.OK);
        } else {
            throw new ResourceNotFoundException();
        }
    }

    @GetMapping(GET_BY_ID)
    @ApiOperation(value = "Get category by id")
    public ResponseEntity<CategoryResponseDTO> getCategoryById(@PathVariable Long id) {
        Optional<Category> optionalCategory = categoryService.findById(id);
        return optionalCategory.map(t ->
                        new ResponseEntity<>(categoryMapper.categoryToResponseDto(t), HttpStatus.OK))
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @PostMapping
    @ApiOperation(value = "Create category")
    public ResponseEntity<CategoryResponseDTO> createCategory(@RequestBody CategoryRequestDTO categoryRequestDTO) {
        Category category = categoryService.save(categoryService.save(categoryMapper.requestDtoToCategory(categoryRequestDTO)));
        return new ResponseEntity<>(categoryMapper.categoryToResponseDto(category), HttpStatus.CREATED);
    }

    @DeleteMapping(DELETE_BY_ID)
    @ApiOperation(value = "Delete category by Id")
    public ResponseEntity<String> delete(@PathVariable Long id){
        Optional<Category> optional = categoryService.findById(id);

        return optional.map(t ->
                        new ResponseEntity<>("Category with the id " + id + " was deleted.", HttpStatus.NO_CONTENT))
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @PutMapping
    @ApiOperation(value = "Update category")
    public ResponseEntity<String> update(@RequestBody CategoryRequestDTO categoryRequestDTOToUpdate){
        Optional<Category> categoryToSaveOptional = categoryService.findById(categoryRequestDTOToUpdate.getId());
        categoryToSaveOptional.ifPresent(n -> categoryService.update(categoryMapper.requestDtoToCategory(categoryRequestDTOToUpdate), n));

        return categoryToSaveOptional.map(n ->
                        new ResponseEntity<>("Category with id " + categoryRequestDTOToUpdate.getId() + " was updated.", HttpStatus.OK))
                .orElseThrow(() -> new ResourceNotFoundException(categoryRequestDTOToUpdate.getId()));
    }
}
