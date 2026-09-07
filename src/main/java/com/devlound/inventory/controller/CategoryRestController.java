package com.devlound.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlound.inventory.model.Category;
import com.devlound.inventory.response.CategoryResponseRest;

import com.devlound.inventory.service.ICategoryService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {

    private final ICategoryService service;

    public CategoryRestController(ICategoryService service) {
        this.service = service;
    }


    @GetMapping("/categories")
public ResponseEntity<CategoryResponseRest> searchCategories() {

    ResponseEntity<CategoryResponseRest> response = service.search();   return response;
}


@GetMapping("/categories/{id}")
public ResponseEntity<CategoryResponseRest> searchCategoryById(@PathVariable Long id) {
    ResponseEntity<CategoryResponseRest> response = service.searchById(id);
    return response;
}

@PostMapping("/categories/create")
public ResponseEntity<CategoryResponseRest> createCategory(@RequestBody Category category) {
    ResponseEntity<CategoryResponseRest> response = service.create(category);
    return response;
}


}
