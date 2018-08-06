package com.Project.service.impl;
import com.Project.dao.IUserDao;
import com.Project.model.User;
import com.Project.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User selectUser(String UserId) {
        return this.userDao.selectUser(UserId);
    }
}
