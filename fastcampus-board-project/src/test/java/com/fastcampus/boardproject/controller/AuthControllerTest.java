package com.fastcampus.boardproject.controller;

import com.fastcampus.boardproject.config.SecurityConfig;
import com.fastcampus.boardproject.repository.UserAccountRepository;
import com.fastcampus.boardproject.util.FormDataEncoder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("View 컨트롤러 - 인증")
@ContextConfiguration(classes = {SecurityConfig.class})
@Import(SecurityConfig.class)
@WebMvcTest(Void.class)
public class AuthControllerTest {

    private final MockMvc mvc;

    @MockBean
    private UserAccountRepository userAccountRepository;


    public AuthControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("[view][GET] 로그인 페이지 - 정상 호출")
    @Test
    void givenNothing_whenTryingToLogin_thenReturnsLoginView() throws Exception {

        //given

        //when & then
        mvc.perform(get("/login"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andDo(MockMvcResultHandlers.print());
    }
}
