package com.study.domain.search;

import com.study.domain.paging.PagingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class SearchController {
		@Autowired
		private SearchService searchService;

		//전체회원 조회

		/*
		@GetMapping()
		public List<MemberResponse> getAllUsers(){
			return searchService.getAllUsers();
		}
		*/

		//페이지 처리된 전체조회
		@GetMapping("")
		public PagingResponse<MemberResponse> getAllUsers(SearchDto params){
			return searchService.getAllUsers(params);
		}

		//단일회원 조회
		@GetMapping("/one/{params}")
		public MemberResponse getUser(@PathVariable String params) {
			return searchService.getUser(params);
		}

		//단일 회원 주문 목록 조회
		@GetMapping("/order/{params}")
		public OrderResponse getOrder(@PathVariable String params){
			return searchService.getOrder(params);
		}

}
