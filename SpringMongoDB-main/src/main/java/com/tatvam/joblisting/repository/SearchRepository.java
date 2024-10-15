package com.tatvam.joblisting.repository;

import com.tatvam.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
