package com.study.domain.update;

import com.study.domain.search.MemberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    @Autowired
    UpdateMapper updateMapper;

    public int UserUpdate(){
        return updateMapper.UserUpdate();
    }
}
