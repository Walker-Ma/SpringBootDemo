package com.example.springbootdemo.service;

import java.util.List;

import com.example.springbootdemo.domain.User;

public interface IUserService {
    /**
     * 添加单个用户信息
     * @param user
     */
    void addUser(User user);

    /**
     * 修改单个用户信息
     * @param user
     */
    void editUser(User user);
    
    /**
     * 根据id删除指定用户信息
     * @param id
     */
    void deleteUserById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<User> findAll();

    /**
     * 查询数据库中是否存在该用户信息
     * @return
     */
    User findUserById(Integer id);

}
