package com.projetospring.projectweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.projectweb.entities.Category;
import com.projetospring.projectweb.repositories.CategoryRepository;

@Service
public class CategoryService {
	//Injeção de dependência
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
}
}