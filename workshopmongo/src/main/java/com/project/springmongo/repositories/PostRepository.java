package com.project.springmongo.repositories;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,Serializable>  {

	@Query("{'title': { $regex: ?0, $options: 'i'} }")
	List<Post> searchTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{$and: [ {date: {$gte: ?1}, {date: {$lte: ?2},{$or: [ {'title': { $regex: ?0, $options: 'i'}, {'body': { $regex: ?0, $options: 'i'},{{'comments.txt': { $regex: ?0, $options: 'i'} } ] }")
	List<Post> fullsearch(String text, Date minDate, Date maxDate);
}
