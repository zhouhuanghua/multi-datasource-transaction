package cn.zhh.service;

import cn.zhh.entity.Student;

/**
 * 学生服务接口
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:22
 */
public interface StudentService {

    /**
     * 插入一条学生记录
     *
     * @param student 学生信息
     */
    void insert(Student student);

    /**
     * 根据id删除学生记录
     *
     * @param id 学生id
     */
    void deleteById(Long id);
}
