package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Map;

public interface UserService {

    Map login(Map<String,Object> map);

    int insert(User user);

    int update(User user);

    int delete(String id);
}
