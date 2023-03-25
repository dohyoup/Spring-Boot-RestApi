package com.study.domain.search;

import com.study.domain.paging.Pagination;
import com.study.domain.paging.PagingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchMapper searchMapper;

    // 전체 회원 조회
    public PagingResponse<MemberResponse> getAllUsers(final SearchDto params){

        int count = searchMapper.count(params);
        if(count < 1) {
            return new PagingResponse<>(Collections.emptyList(), null);
        }
        Pagination pagination = new Pagination(count, params);
        params.setPagination(pagination);

        List<MemberResponse> list = searchMapper.getAllUsers(params);
        return new PagingResponse<>(list, pagination);
    }

    // 단일 회원 상세 조회
    public MemberResponse getUser(String params) {
        return searchMapper.getUser(params);
    }

    //단일 회원 주문 목록 조회
    public OrderResponse getOrder(String params) {
        return searchMapper.getOrder(params);
    }
}
