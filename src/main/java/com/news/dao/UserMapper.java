package com.news.dao;

import com.news.bean.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectByName(@Param("name") String name);

    int deleteById(Integer id);

    int insertUser(User user);

    User selectById(Integer id);

    int updateById(User record);
}