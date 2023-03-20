package com.study.domain.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private SearchMapper searchMapper;

    // 전체 회원 조회
    public List<UserResponse> getAllUsers(){
        return searchMapper.getAllUsers();
    }

    // 단일 회원 상세 조회
    public UserResponse getUser(String params) {
        return searchMapper.getUser(params);
    }

    // 회원 가입
    public UserRequest  registerUser(UserRequest userinfo) {

        UserRequest param = new UserRequest();
        param.setId(userinfo.getId());
        param.setNickName(userinfo.getNickName());
        param.setPw(userinfo.getPw());
        param.setPhone(userinfo.getPhone());
        param.setEmail(userinfo.getEmail());
        param.setGender(userinfo.getGender());

        return searchMapper.registerUser(userinfo);
    }
}
