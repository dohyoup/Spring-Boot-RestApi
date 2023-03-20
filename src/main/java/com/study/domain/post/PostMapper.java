package com.study.domain.post;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface PostMapper {
    /**
     * 회원 추가
     * @param params - 게시글 정보
     */
    void save(PostRequest params);

    /**
     * 회원 상세정보 조회
     *
     * @param id - PK
     * @return 게시글 상세정보
     */
    PostResponse findById(String id);

    /**
     * 회원 정보 수정
     * @param params - 게시글 정보
     */
    void update(PostRequest params);

    /**
     * 회원 삭제
     * @param id - PK
     */
    void deleteById(String id);

    /**
     * 회원 리스트 조회
     * @return 게시글 리스트
     */
    List<PostResponse> findAll();

    /**
     * 회원 수 카운팅
     * @return 회원 수
     */
 //   int count();

}
