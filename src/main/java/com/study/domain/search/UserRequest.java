package com.study.domain.search;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String id;
	private String nickName;
	private String pw;
	private String phone;
	private String email;
	private String gender;
}
