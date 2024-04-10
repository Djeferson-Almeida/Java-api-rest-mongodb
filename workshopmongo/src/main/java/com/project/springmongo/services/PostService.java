package com.project.springmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.project.springmongo.domain.Post;
import com.project.springmongo.repositories.PostRepository;
import com.project.springmongo.resources.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional <Post> obj = repo.findById(id);
		return null;
		
	
}
}
