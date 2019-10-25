package cn.zhh.mapper;

import cn.zhh.entity.Student;

/**
 * 学生Mapper
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:09
 */
public interface StudentMapper {

    /**
     * 插入一条学生记录
     *
     * @param student 学生信息
     * @return 插入数量
     */
    int insert(Student student);

    /**
     * 根据id删除学生记录
     *
     * @param id 学生id
     * @return 删除数量
     */
    int deleteById(Long id);
}
