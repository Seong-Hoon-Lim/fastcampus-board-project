package com.fastcampus.boardproject.controller;

import com.fastcampus.boardproject.config.SecurityConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("View 컨트롤러 - 게시글")
@Import(SecurityConfig.class)
@WebMvcTest(ArticleController.class)
class ArticleControllerTest {

    private final MockMvc mvc;

    public ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("[view][GET] 게시글 리스트 (게시판) 페이지 - 정상 호출")
    @Test
    void givenNoting_whenRequestingArticles_thenReturnsArticlesView() throws Exception {

        //given

        //when & then
        mvc.perform(get("/articles"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(MockMvcResultMatchers.view().name("articles/index"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("articles"));

    }

    @DisplayName("[view][GET] 게시글 상세 페이지 - 정상 호출")
    @Test
    void givenNoting_whenRequestingArticleView_thenReturnsArticleView() throws Exception {

        //given

        //when & then
        mvc.perform(get("/articles/2"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(MockMvcResultMatchers.view().name("articles/detail"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("article"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("articleComments"));

    }

    @Disabled("개발 중")
    @DisplayName("[view][GET] 게시글 검색 전용 페이지 - 정상 호출")
    @Test
    void givenNoting_whenRequestingArticleSearchView_thenReturnsArticleSearchView() throws Exception {

        //given

        //when & then
        mvc.perform(get("/articles/search"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(MockMvcResultMatchers.model().attributeExists("articles/search"));

    }

    @Disabled("개발 중")
    @DisplayName("[view][GET] 게시글 해시태그 검색 페이지 - 정상 호출")
    @Test
    void givenNoting_whenRequestingArticleHashtagSearchView_thenReturnsArticleHashtagSearchView() throws Exception {

        //given

        //when & then
        mvc.perform(get("/articles/search=hashtag"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(MockMvcResultMatchers.model().attributeExists("articles/search-hashtag"));;

    }

}