package com.pietrokucharski.spring_project.repositories;

import com.pietrokucharski.spring_project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
