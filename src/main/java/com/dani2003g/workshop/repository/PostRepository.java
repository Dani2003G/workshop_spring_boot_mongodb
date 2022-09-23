package com.dani2003g.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dani2003g.workshop.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}