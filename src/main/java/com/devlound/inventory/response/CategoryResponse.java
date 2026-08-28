package com.devlound.inventory.response;

import java.util.List;
import java.util.Locale.Category;

import lombok.Data;
@Data
public class CategoryResponse {
private List<Category> category;
}
