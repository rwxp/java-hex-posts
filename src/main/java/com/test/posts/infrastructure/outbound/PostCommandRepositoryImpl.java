package com.test.posts.infrastructure.outbound;

import com.test.posts.domain.model.PostCommand;
import com.test.posts.domain.model.PostQuery;
import com.test.posts.domain.repository.PostCommandRepository;
import com.test.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;

    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        //Código a implementar
        return Optional.empty();
    }

    @Override
    public void deletePost(int id) {
        //Código a implementar
    }
}
