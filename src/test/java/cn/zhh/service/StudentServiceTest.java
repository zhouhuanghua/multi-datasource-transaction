package cn.zhh.service;

import cn.zhh.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void insert() {
        Student student = new Student();
        student.setName("周煌华");
        student.setCode(UUID.randomUUID().toString());
        student.setSex((byte) 1);
        studentService.insert(student);
    }

}