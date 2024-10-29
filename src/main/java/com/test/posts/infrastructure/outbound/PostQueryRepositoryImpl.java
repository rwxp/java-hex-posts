package com.test.posts.infrastructure.outbound;

import com.test.posts.domain.model.PostQuery;
import com.test.posts.domain.repository.PostQueryRepository;
import com.test.posts.infrastructure.outbound.database.PostRepository;
import com.test.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import com.test.posts.infrastructure.outbound.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {
    private final PostRepository postRepository;
    private final PostMapper postMapper;


    @Override
    public List<PostQuery> findAllPosts() {
        return postRepository.findAll().stream()
                .map(postMapper::toPostQuery)
                .collect(Collectors.toList());
    }
}