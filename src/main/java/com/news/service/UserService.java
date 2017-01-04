package com.news.service;

import com.news.bean.User;

/**
 * Created by Administrator on 2017/1/4.
 */

public interface UserService {

    User selectByName(String name);

}
