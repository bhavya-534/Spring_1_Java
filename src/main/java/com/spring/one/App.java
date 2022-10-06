package com.spring.one;

import com.spring.one.model.User;
import com.spring.one.repository.UserRepository;
import com.spring.one.repository.UserRepositoryImpl;
import com.spring.one.service.UserService;
import com.spring.one.service.UserServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //Entry point
        UserService service = new UserServiceImpl();

        //service.manipulateData() - method calling
        User user = service.manipulateData().get(1);

        System.out.println("Hey...'" +user.getFirstName()+"' u r using Java ");


    }
}
