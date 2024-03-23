package com.projetospring.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.projectweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

	
	
	
}
