package com.projetospring.projectweb.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.projectweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
	
}
