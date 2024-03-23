package com.projetospring.projectweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.projectweb.entities.Order;
import com.projetospring.projectweb.repositories.OrderRepository;

@Service
public class OrderService {
	//Injeção de dependência
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
}
}
