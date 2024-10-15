package com.test.posts.domain.repository;

import com.test.posts.domain.model.PostCommand;
import com.test.posts.domain.model.PostQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostCommandRepository {
    Optional<PostQuery> createPost(PostCommand postCommand);
    Optional<PostQuery> updatePost(PostCommand postCommand);
    void deletePost(int id);
}