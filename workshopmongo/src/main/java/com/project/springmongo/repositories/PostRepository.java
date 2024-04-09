package com.project.springmongo.repositories;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,Serializable>  {

	
}
