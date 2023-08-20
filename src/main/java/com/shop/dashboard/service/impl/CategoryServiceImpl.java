package com.shop.dashboard.service.impl;

import com.shop.dashboard.dto.request.CategoryRequestDTO;
import com.shop.dashboard.dto.response.CategoryResponseDTO;
import com.shop.dashboard.entity.Category;
import com.shop.dashboard.mapper.CategoryMapper;
import com.shop.dashboard.repository.CategoryRepository;
import com.shop.dashboard.service.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CrudService<CategoryResponseDTO, CategoryRequestDTO> {

    private CategoryRepository categoryRepository;
    private CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository,
                               CategoryMapper categoryMapper){
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryResponseDTO> getAll() {
        return categoryMapper.entityToDTOList(categoryRepository.findAll());
    }

    @Override
    public CategoryResponseDTO save(CategoryRequestDTO category) {
        return categoryMapper.entityToDTO(categoryRepository.save(
                categoryMapper.DTOToEntity(category)
        ));
    }

    @Override
    public CategoryResponseDTO getById(Long id) {

        return categoryMapper.entityToDTO(categoryRepository.findById(id).get());
    }

    @Override
    public boolean delete(Long id) {
         categoryRepository.deleteById(id);
         return true;
    }
}
