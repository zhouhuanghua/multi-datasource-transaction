package cn.zhh.service;

import cn.zhh.entity.Student;
import cn.zhh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MultiDataSourceServiceTest {

    @Autowired
    private MultiDataSourceService multiDataSourceService;

    @Test
    public void bothInsert() throws Exception {
        // 学生
        Student student = new Student();
        student.setName("周煌华");
        student.setCode(UUID.randomUUID().toString());
        student.setSex((byte) 1);
        // 用户
        User user = new User();
        user.setUsername(UUID.randomUUID().toString());
        user.setPassword("10009169");
        user.setMobile("15682568083");
        // 一起插入
        multiDataSourceService.bothInsert(student, user);
    }

    @Test
    public void bothDelete() throws Exception {
        multiDataSourceService.bothDelete(28L, 17L);
    }
}
