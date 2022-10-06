package com.spring.one.repository;

import com.spring.one.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {


    public List<User> findData() {

        List<User> list = new ArrayList<User>();
        User user1 = new User("bhavya", "Ch",534);
        User user2 = new User("Saiki", "M",986);

        list.add(user1);
        list.add(user2);
        return list;
    }
}
