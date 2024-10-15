package com.test.posts.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PostQuery {
    private Long userId;
    private Long id;
    private String title;
    private String body;
}