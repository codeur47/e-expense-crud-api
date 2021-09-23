package com.yorosoft.eexpensecrudapi.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yorosoft.eexpensecrudapi.dto.CategoryRequestDTO;
import com.yorosoft.eexpensecrudapi.dto.CategoryResponseDTO;
import com.yorosoft.eexpensecrudapi.mapper.CategoryMapper;
import com.yorosoft.eexpensecrudapi.model.Category;
import com.yorosoft.eexpensecrudapi.model.Purchase;
import com.yorosoft.eexpensecrudapi.service.CategoryService;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CategoryController.class})
@ExtendWith(SpringExtension.class)
class CategoryControllerTest {
    @Autowired
    private CategoryController categoryController;

    @MockBean
    private CategoryMapper categoryMapper;

    @MockBean
    private CategoryService categoryService;

    @Test
    void testCreateCategory() throws Exception {
        when(this.categoryService.findAll()).thenReturn(new ArrayList<Category>());

        ArrayList<CategoryResponseDTO> categoryResponseDTOList = new ArrayList<CategoryResponseDTO>();
        categoryResponseDTOList.add(new CategoryResponseDTO("Name"));
        when(this.categoryMapper.categoriesToResponseDtos(any()))
                .thenReturn(categoryResponseDTOList);

        CategoryRequestDTO categoryRequestDTO = new CategoryRequestDTO();
        categoryRequestDTO.setId(123L);
        categoryRequestDTO.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(categoryRequestDTO);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/categories")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.categoryController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[{\"id\":null,\"name\":\"Name\"}]"));
    }

    @Test
    void testDelete() throws Exception {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        Optional<Category> ofResult = Optional.<Category>of(category);
        when(this.categoryService.findById((Long) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/categories/{id}", 123L);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.categoryController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Category with the id 123 was deleted."));
    }

    @Test
    void testGetAllCategories() throws Exception {
        when(this.categoryService.findAll()).thenReturn(new ArrayList<Category>());

        ArrayList<CategoryResponseDTO> categoryResponseDTOList = new ArrayList<CategoryResponseDTO>();
        categoryResponseDTOList.add(new CategoryResponseDTO("Name"));
        when(this.categoryMapper.categoriesToResponseDtos(any()))
                .thenReturn(categoryResponseDTOList);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/categories");
        MockMvcBuilders.standaloneSetup(this.categoryController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[{\"id\":null,\"name\":\"Name\"}]"));
    }

    @Test
    void testGetCategoryById() throws Exception {
        Category category = new Category();
        category.setCreatedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setId(123L);
        category.setName("Name");
        category.setPurchaseList(new ArrayList<Purchase>());
        category.setLastModifiedDate(LocalDateTime.of(1, 1, 1, 1, 1));
        Optional<Category> ofResult = Optional.<Category>of(category);
        when(this.categoryService.findById((Long) any())).thenReturn(ofResult);
        when(this.categoryMapper.categoryToResponseDto((Category) any())).thenReturn(new CategoryResponseDTO("Name"));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/categories/{id}", 123L);
        MockMvcBuilders.standaloneSetup(this.categoryController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"id\":null,\"name\":\"Name\"}"));
    }

    @Test
    void testUpdate() throws Exception {
        when(this.categoryService.findAll()).thenReturn(new ArrayList<Category>());

        ArrayList<CategoryResponseDTO> categoryResponseDTOList = new ArrayList<CategoryResponseDTO>();
        categoryResponseDTOList.add(new CategoryResponseDTO("Name"));
        when(this.categoryMapper.categoriesToResponseDtos(any()))
                .thenReturn(categoryResponseDTOList);

        CategoryRequestDTO categoryRequestDTO = new CategoryRequestDTO();
        categoryRequestDTO.setId(123L);
        categoryRequestDTO.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(categoryRequestDTO);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/categories")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.categoryController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[{\"id\":null,\"name\":\"Name\"}]"));
    }
}

