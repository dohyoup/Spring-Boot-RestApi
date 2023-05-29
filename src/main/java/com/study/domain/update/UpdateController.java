package com.study.domain.update;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UpdateController {
    @Autowired
    UpdateService updateService;

    @PutMapping("/update/{param}")
    public int UserUpdate () {
        return updateService.UserUpdate();
    }


}
