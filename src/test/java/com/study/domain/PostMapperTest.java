package com.study.domain;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.study.domain.post.PostMapper;
import com.study.domain.post.PostRequest;
import com.study.domain.post.PostResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostMapperTest {

    @Autowired
    PostMapper postMapper;

    @Test
    void save() {
        PostRequest params = new PostRequest();
        params.setId("testName16");
        params.setNickName("nickname16");
        params.setPw("testPw16!");
        params.setPhone("010-5454-5454");
        params.setEmail("test16@naver,com");
        params.setGender("여");
        postMapper.save(params);

        List<PostResponse> posts = postMapper.findAll();
        System.out.println("전체 게시글 개수는 : " + posts.size() + "개입니다.");
    }

    @Test
    void findById() {
        PostResponse post = postMapper.findById("testName1");
        try {
            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(post);
            System.out.println(postJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void update() {
        // 1. 게시글 수정
        PostRequest params = new PostRequest();
        params.setId("testName17");
        params.setNickName("nickname17");
        params.setPw("testPw17!");
        params.setPhone("010-5757-5757");
        params.setEmail("test17@naver,com");
        params.setGender("여");
        postMapper.update(params);

        // 2. 게시글 상세정보 조회
        PostResponse post = postMapper.findById("testName1");
        try {
            System.out.println(post);
            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(post);
            System.out.println(postJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
