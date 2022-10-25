package com.nestdigital.TodoFullStack.Controller;

import com.nestdigital.TodoFullStack.Dao.UserDao;
import com.nestdigital.TodoFullStack.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private UserDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/signup",consumes = "application/json",produces = "application/json")
    public String Signup(@RequestBody UserModel signup){
        System.out.println(signup.toString());
        dao.save(signup);
        return "Welcome to signup";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewall")
    public List<UserModel>viewall(){
        return (List<UserModel>) dao.findAll();
    }
}
