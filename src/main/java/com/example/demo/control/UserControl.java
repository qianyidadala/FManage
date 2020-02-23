package com.example.demo.control;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("userService")
public class UserControl {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("login")
    public Map login(){
        Map<String,Object> map = new HashMap<>();
        return userServiceImpl.login(map);
    }

    @RequestMapping("insert")
    public int insert(){
        int i = 0;

       return i;
    }
    @RequestMapping("update")
    public int update(){
        int i = 0;

        return i;
    }
    @RequestMapping("delete")
    public int delete(){
        int i = 0;

        return i;
    }

}
