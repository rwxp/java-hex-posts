package com.test.posts.infrastructure.outbound.mapper;

import com.test.posts.domain.model.PostQuery;
import com.test.posts.infrastructure.outbound.database.Post;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public PostQuery toPostQuery(Post post) {
        if (post == null) {
            return null;
        }
        PostQuery postQuery = new PostQuery();
        postQuery.setId(post.getId());
        postQuery.setTitle(post.getTitle());
        postQuery.setBody(post.getBody());
        return postQuery;
    }

    public Post toPost(PostQuery postQuery) {
        if (postQuery == null) {
            return null;
        }
        Post post = new Post();
        post.setId(postQuery.getId());
        post.setTitle(postQuery.getTitle());
        post.setBody(postQuery.getBody());
        return post;
    }
}
