package com.Project.dao;
import com.Project.model.User;
public interface IUserDao {
    User selectUser(String id);
}
