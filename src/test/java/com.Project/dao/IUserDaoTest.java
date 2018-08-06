package com.Project.dao;
import com.Project.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//加载Spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
    @Autowired
    private IUserDao dao;
    @Test
    public void testSelectUser() throws Exception {
        String UserId = "2015216748";
        User user = dao.selectUser(UserId);
        System.out.println(user.getUserName());
    }
}
