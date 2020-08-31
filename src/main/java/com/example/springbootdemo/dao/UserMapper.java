package com.example.springbootdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.domain.User;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 添加单个用户信息
     * @param user 用户信息
     */
    void addUser(User user);

    /**
     * 修改单个用户信息
     * @param user 用户信息
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
