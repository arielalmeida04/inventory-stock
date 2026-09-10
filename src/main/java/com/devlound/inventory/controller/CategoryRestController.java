package com.devlound.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.devlound.inventory.model.Category;
import com.devlound.inventory.response.CategoryResponseRest;
import com.devlound.inventory.service.ICategoryService;

import jakarta.transaction.Transactional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class CategoryRestController {

    private final ICategoryService service;

    public CategoryRestController(ICategoryService service) {
        this.service = service;
    }

    @GetMapping("/categories")
    @Transactional 
    public ResponseEntity<CategoryResponseRest> searchCategories() {
        return service.search();
    }

    @GetMapping("/categories/{id}")
    @Transactional 
    public ResponseEntity<CategoryResponseRest> searchCategoryById(
            @PathVariable Long id) {
        return service.searchById(id);
    }

    @PostMapping("/categories/create")
    @Transactional 
    public ResponseEntity<CategoryResponseRest> createCategory(
            @RequestBody Category category) {
        return service.create(category);
    }

    @PutMapping("/categories/{id}")
    @Transactional 
    public ResponseEntity<CategoryResponseRest> updateCategory(
            @RequestBody Category category,
            @PathVariable Long id) {
        return service.update(category, id);
    }

    @DeleteMapping("/categories/{id}")
     @Transactional
    public ResponseEntity<CategoryResponseRest> deleteCategory(
            @PathVariable Long id) {
        return service.delete(id);
    }
}