package com.tatvam.joblisting.repository;

import com.tatvam.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
