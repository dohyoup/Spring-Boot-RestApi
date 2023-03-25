package com.study.domain.register;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class RegisterRequest {
	@NotBlank(message = "이름은 필수 입력입니다.")
	@Pattern(regexp = "^[a-zA-Zㄱ-ㅎ가-힣]*$")
	@Size(max = 20)
    private String id;

	@NotBlank(message = "닉네임은 필수 입력입니다.")
	@Pattern(regexp = "^[a-z]*$")
	@Size(max = 30)
	private String nickName;

	@NotBlank(message = "비밀번호는 필수 입력입니다.")
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{10,20}$")
	private String pw;

	@NotBlank(message = "연락처는 필수 입력입니다.")
	@Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}")
	@Size(max = 20)
	private String phone;

	@NotBlank(message = "이메일은 필수 입력입니다.")
	@Email
	@Size(max = 100)
	private String email;

	@NotBlank(message = "성별은 필수 입력입니다.")
	@Pattern(regexp = "[ㄱ-ㅎ가-힣]*$")
	@Size(max = 2)
	private String gender;

}
