package com.study.domain.search;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface SearchMapper {

        /**
         ** 회원 전체 조회
         *
         * @return 회원 전체 정보
         */
        List<UserResponse> getAllUsers();

         /**
         ** 회원 상세정보 조회
         *
         * * * @param id - PK
         * @return 회원 상세정보
         */
        UserResponse getUser(String params);

        /**
         ** 회원 정보 추가
         *
         * * * @param UserRequest - PK
         * @return 성공 여부
         */
        UserRequest registerUser(UserRequest userinfo);
}
