package com.shop.dashboard.controller;

import com.shop.commons.data.ResponseDTO;
import com.shop.dashboard.dto.request.CategoryRequestDTO;
import com.shop.dashboard.dto.response.CategoryResponseDTO;
import com.shop.dashboard.service.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CrudService<CategoryResponseDTO, CategoryRequestDTO> categoryService;
    public CategoryController(CrudService categoryService){
        this.categoryService =  categoryService;
    }

    @GetMapping("/")
    public ResponseEntity<ResponseDTO<List<CategoryResponseDTO>>> getCategories(){
        ResponseDTO<List<CategoryResponseDTO>> responseDTO = new ResponseDTO<>(categoryService.getAll(),
                "success");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public CategoryResponseDTO getCategory(@PathVariable long id){
        return categoryService.getById(id);
    }

}
