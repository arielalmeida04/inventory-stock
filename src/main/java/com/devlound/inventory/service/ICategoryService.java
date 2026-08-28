package com.devlound.inventory.service;

import org.springframework.http.ResponseEntity;


import com.devlound.inventory.response.CategoryResponseRest;

public interface ICategoryService {

    ResponseEntity<CategoryResponseRest> search();
    ResponseEntity<CategoryResponseRest> searchById(Long id);
    ResponseEntity<CategoryResponseRest> create(CategoryResponseRest categoryResponseRest);
    ResponseEntity<CategoryResponseRest> update(Long id, CategoryResponseRest categoryResponseRest);
    ResponseEntity<CategoryResponseRest> delete(Long id);

}
