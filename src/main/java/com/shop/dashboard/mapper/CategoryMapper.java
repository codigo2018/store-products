package com.shop.dashboard.mapper;

import com.shop.dashboard.dto.request.CategoryRequestDTO;
import com.shop.dashboard.dto.response.CategoryResponseDTO;
import com.shop.dashboard.entity.Category;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryMapper {

    public Category DTOToEntity(CategoryRequestDTO categoryRequestDTO) {
        return Category.builder()
                .categoryCode(categoryRequestDTO.getCategoryCode())
                .name(categoryRequestDTO.getName())
                .isEnable(categoryRequestDTO.isEnable())
                .build();
    }

    public CategoryResponseDTO entityToDTO(Category category) {
        return CategoryResponseDTO.builder()
                .categoryCode(category.getCategoryCode())
                .isEnable(category.isEnable())
                .name(category.getName())
                .build();
    }

    public List<CategoryResponseDTO> entityToDTOList(List<Category> categoryList) {
        return categoryList.stream().map(this::entityToDTO).collect(Collectors.toList());
    }
}
