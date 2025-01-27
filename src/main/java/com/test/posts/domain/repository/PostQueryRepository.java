package com.test.posts.domain.repository;

import com.test.posts.domain.model.PostQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface PostQueryRepository {
    List<PostQuery> findAllPosts();
}