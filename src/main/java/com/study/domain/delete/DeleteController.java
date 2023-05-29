package com.study.domain.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class DeleteController {

    @Autowired
    DeleteMapper deleteMapper;

    @Autowired
    DeleteService deleteService;

    @PostMapping("delete/{userId}")
    public int deleteById(@PathVariable String userId){
        return deleteService.deleteById(userId);
    }
}
