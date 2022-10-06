package com.spring.one.repository;

import com.spring.one.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findData();


}
