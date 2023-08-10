package com.fastcampus.boardproject.repository;

import com.fastcampus.boardproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}