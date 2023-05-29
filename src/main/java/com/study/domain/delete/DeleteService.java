package com.study.domain.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {
    @Autowired
    DeleteMapper deleteMapper;

    public int deleteById(String userId){
        return deleteMapper.deleteById(userId);
    }
}
