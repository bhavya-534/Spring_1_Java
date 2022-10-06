package com.spring.one.service;

import com.spring.one.model.User;
import com.spring.one.repository.UserRepository;
import com.spring.one.repository.UserRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public List<User> manipulateData() {

        repository = new UserRepositoryImpl();

        return repository.findData();

    }




}

