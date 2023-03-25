package com.study.domain.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
@Validated
public class RegisterController {

      @Autowired
        private RegisterService registerService;

        //회원가입
		@PostMapping("")
		public void registerUser(@Valid @RequestBody RegisterRequest userinfo, Errors errors) {
			boolean res = registerService.registerUser(userinfo);
			if(res == true) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
		}
}
