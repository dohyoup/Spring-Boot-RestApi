package com.study.domain.register;

import com.study.domain.search.SearchRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {

        /**
         ** 회원 정보 추가
         *
         * * * @param RegisterRequest - PK
         * @return 성공 여부
         */
        int registerUser(RegisterRequest param);
}
