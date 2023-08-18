package com.fastcampus.boardproject.dto;

import com.fastcampus.boardproject.domain.Article;
import com.fastcampus.boardproject.domain.ArticleComment;
import com.fastcampus.boardproject.domain.UserAccount;

import java.time.LocalDateTime;

public record ArticleCommentDto(
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime modifiedAt,
        String modifiedBy,
        String content
) {
    public static ArticleCommentDto of(LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy, String content) {
        return new ArticleCommentDto(createdAt, createdBy, modifiedAt, modifiedBy, content);
    }
}
