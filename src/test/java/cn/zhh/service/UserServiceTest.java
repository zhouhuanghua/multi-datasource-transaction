package cn.zhh.service;

import cn.zhh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername(UUID.randomUUID().toString());
        user.setPassword("10009169");
        user.setMobile("15682568083");
        userService.insert(user);
    }

}