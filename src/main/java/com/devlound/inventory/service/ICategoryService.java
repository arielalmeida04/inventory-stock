package com.devlound.inventory.service;

import org.springframework.http.ResponseEntity;

import com.devlound.inventory.model.Category;
import com.devlound.inventory.response.CategoryResponseRest;

public interface ICategoryService {

    ResponseEntity<CategoryResponseRest> search();
    ResponseEntity<CategoryResponseRest> searchById(Long id);
    ResponseEntity<CategoryResponseRest> create(Category category);
    ResponseEntity<CategoryResponseRest> update(Category category, Long id);
    ResponseEntity<CategoryResponseRest> delete(Long id);

}
