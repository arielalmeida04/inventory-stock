package com.devlound.inventory.dao;

import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDAO extends JpaRepository<Category, Long> {

}
