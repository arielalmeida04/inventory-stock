package com.devlound.inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.devlound.inventory.model.Category;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


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
                    response.setMetadata("Respuesta nok", "404", "no se encontro ningun registro");
                    return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.NOT_FOUND);
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
    
            CategoryResponseRest response = new CategoryResponseRest();
            List<Category> categories = new ArrayList<>();
            try {
                Optional<Category> category = categoryDAO.findById(id);
                

                if (category.isPresent()) {

                    categories.add(category.get());
                    response.getCategoryResponse().setCategory(categories);
                    response.setMetadata("Respuesta ok", "200", "respuesta exitosa");
                    
                } else {
                    
                    response.setMetadata("Respuesta nok", "404", "no se encontro ningun registro");
                    return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.NOT_FOUND);
                }


            } catch (Exception e) {
                return new  ResponseEntity<CategoryResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }

            return new  ResponseEntity<CategoryResponseRest>(response, HttpStatus.OK);


    }

    @Override
    @Transactional
    public ResponseEntity<CategoryResponseRest> create(Category category) {
       CategoryResponseRest response = new CategoryResponseRest();
            List<Category> categories = new ArrayList<>();
            try {
                Optional<Category> category = categoryDAO.findById(id);
                

                if (category.isPresent()) {

                    categories.add(category.get());
                    response.getCategoryResponse().setCategory(categories);
                    response.setMetadata("Respuesta ok", "200", "respuesta exitosa");
                    
                } else {
                    
                    response.setMetadata("Respuesta nok", "404", "no se encontro ningun registro");
                    return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.NOT_FOUND);
                }


            } catch (Exception e) {
                return new  ResponseEntity<CategoryResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }

            return new  ResponseEntity<CategoryResponseRest>(response, HttpStatus.OK);

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
