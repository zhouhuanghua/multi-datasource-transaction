package cn.zhh.service;

import cn.zhh.entity.Student;
import cn.zhh.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 学生服务实现类
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:24
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional
    public void insert(Student student) {
        int insertCount = studentMapper.insert(student);
        if (insertCount < 1) {
            throw new RuntimeException("学生记录插入失败！");
        }
//        int i = 1 / 0;
    }

    @Override
    public void deleteById(Long id) {
        int deleteCount = studentMapper.deleteById(id);
        if (deleteCount < 1) {
            throw new RuntimeException("学生记录删除失败！");
        }
    }
}
