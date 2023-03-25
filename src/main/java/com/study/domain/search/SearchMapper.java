package com.study.domain.search;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchMapper {

        /**
         ** 회원 전체 조회
         *
         * @return 회원 전체 정보
         */
        List<MemberResponse> getAllUsers(SearchDto params);

         /**
          * 게시글 수 카운팅
          * @param params - search conditions
          * @return 게시글 수
          */
         int count(SearchDto params);

         /**
         ** 회원 상세정보 조회
         *
         * * * @param id, email
         * @return 회원 상세정보
         */
        MemberResponse getUser(String params);

         /**
         ** 회원 주문정보 조회
         *
         * * * @param id, email
         * @return 회원 상세정보
         */
        OrderResponse getOrder(String params);

}
