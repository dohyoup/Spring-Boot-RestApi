package com.study.domain.register;

import com.study.domain.search.MemberResponse;
import com.study.domain.search.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    RegisterMapper registerMapper;

    @Autowired
    SearchMapper searchMapper;

    // 회원 가입
    public boolean registerUser(RegisterRequest userinfo) {
        RegisterRequest param = new RegisterRequest();
        MemberResponse userId = searchMapper.getUser(userinfo.getId());
        if(userId == null) {
            param.setId(userinfo.getId());
            param.setNickName(userinfo.getNickName());
            param.setPw(userinfo.getPw());
            param.setPhone(userinfo.getPhone());
            param.setEmail(userinfo.getEmail());
            param.setGender(userinfo.getGender());
            int res = registerMapper.registerUser(param);

            if(res == 1){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
