package com.projetospring.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.projectweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

	
	
	
}
