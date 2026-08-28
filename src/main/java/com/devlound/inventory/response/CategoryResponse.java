package com.devlound.inventory.response;

import java.util.List;
import com.devlound.inventory.model.Category;

import lombok.Data;
@Data
public class CategoryResponse {

    private List<Category> category;
}
