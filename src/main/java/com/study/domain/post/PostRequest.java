package com.study.domain.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {
    private String id;
	private String nickName;
	private String pw;
	private String phone;
	private String email;
	private String gender;
}
