package com.devlound.inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import com.devlound.inventory.dao.ICategoryDAO;
import com.devlound.inventory.response.CategoryResponseRest;

import jakarta.transaction.Transactional;

@Service
public class CategoryService implements ICategoryService {


    private final ICategoryDAO categoryDAO;

    public CategoryService(ICategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    @Transactional
    public ResponseEntity<CategoryResponseRest> search() {
        

            CategoryResponseRest response = new CategoryResponseRest();
            try {
                List<Category> categories = categoryDAO.findAll();
                if (categories.isEmpty()) {
                    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
                } else {
                    response.getCategoryResponse().setCategory(categories);
                    response.setMetadata("Respuesta ok", "200", "respuesta exitosa");
                    
                }


            } catch (Exception e) {
                return new  ResponseEntity<CategoryResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }

            return new  ResponseEntity<CategoryResponseRest>(response, HttpStatus.OK);


    }

    @Override
    @Transactional
    public ResponseEntity<CategoryResponseRest> searchById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchById'");
    }

    @Override
    @Transactional
    public ResponseEntity<CategoryResponseRest> create(CategoryResponseRest categoryResponseRest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    @Transactional
    public ResponseEntity<CategoryResponseRest> update(Long id, CategoryResponseRest categoryResponseRest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    @Transactional
    public ResponseEntity<CategoryResponseRest> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


}
