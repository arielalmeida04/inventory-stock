package com.devlound.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devlound.inventory.response.CategoryResponseRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {

 
    @GetMapping("/categories")
 public ResponseEntity<CategoryResponseRest> searchCategories() {

       
    }

}
