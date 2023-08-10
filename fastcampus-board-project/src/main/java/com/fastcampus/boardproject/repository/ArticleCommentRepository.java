package com.fastcampus.boardproject.repository;

import com.fastcampus.boardproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}
