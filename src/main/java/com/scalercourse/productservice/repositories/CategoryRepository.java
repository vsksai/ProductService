package com.scalercourse.productservice.repositories;

import com.scalercourse.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    Optional<Category> findByTitle(String title);

    Category save(Category category);
}
