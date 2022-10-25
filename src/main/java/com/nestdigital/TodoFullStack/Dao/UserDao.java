package com.nestdigital.TodoFullStack.Dao;

import com.nestdigital.TodoFullStack.Model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,Integer> {
}
