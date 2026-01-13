package com.ecommerce.springboot_ecom.repositories;

import com.ecommerce.springboot_ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
