package com.test.posts.infrastructure.outbound.external;

import com.test.posts.domain.model.PostCommand;
import com.test.posts.domain.model.PostQuery;
import   org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "${json-placeholder.client.name}", url = "${json-placeholder.url}")
public interface JsonPlaceholderAPIClient {
    @PostMapping
    PostQuery create(@RequestBody PostCommand request);

    @GetMapping("/{id}")
    PostQuery findPostById(@PathVariable Integer id);

    @GetMapping
    List<PostQuery> getAllPosts();

    @GetMapping
    List<PostQuery> searchByParam(@RequestParam Map<String, String> params);
}
