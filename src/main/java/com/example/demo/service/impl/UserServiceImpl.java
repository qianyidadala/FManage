package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Map login(Map<String,Object> map) {
        System.out.println("调用登录成功！");
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userDao.selectList(null);
        userList.forEach(System.out::println);
        return map;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(String id) {
        return 0;
    }
}
