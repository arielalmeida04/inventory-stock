package com.devlound.inventory.service;

import org.springframework.web.servlet.function.EntityResponse;

import com.devlound.inventory.response.CategoryResponseRest;

public interface ICategoryService {

    EntityResponse<CategoryResponseRest> search();
    EntityResponse<CategoryResponseRest> searchById(Long id);
    EntityResponse<CategoryResponseRest> create(CategoryResponseRest categoryResponseRest);
    EntityResponse<CategoryResponseRest> update(Long id, CategoryResponseRest categoryResponseRest);
    EntityResponse<CategoryResponseRest> delete(Long id);

}
