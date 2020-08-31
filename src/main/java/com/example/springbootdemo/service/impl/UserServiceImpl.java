package com.example.springbootdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void editUser(User user) {
        userMapper.editUser(user);
    }
    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}