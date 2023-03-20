package com.study.domain.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

		@Autowired
		private UserServiceImpl userServiceImpl;

		//전체회원 조회
		@GetMapping("")
		public List<UserResponse> getAllUsers(){

			return userServiceImpl.getAllUsers();
		}

		//단일회원 조회
		@GetMapping("/{params}")
		public UserResponse getUser(@PathVariable String params) {
			return userServiceImpl.getUser(params);
		}

		//회원가입
		@PostMapping("")
		public void registerUser(@RequestBody UserRequest userinfo) {
			userServiceImpl.registerUser(userinfo);
		}


}
