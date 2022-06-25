package com.example.jpaproject.repositories;

import com.example.jpaproject.entities.Category;
import com.example.jpaproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
