package cn.zhh.service;

import cn.zhh.entity.Student;
import cn.zhh.entity.User;

/**
 * 多数据源服务接口
 *
 * @author Zhou Huanghua
 * @date 2019/10/26 0:55
 */
public interface MultiDataSourceService {

    /**
     * 插入一条学生记录和一条用户记录
     *
     * @param student 学生信息
     * @param user    用户信息
     */
    void bothInsert(Student student, User user);

    /**
     * 根据学生id和用户id删除对应记录
     *
     * @param studentId 学生id
     * @param userId    用户id
     */
    void bothDelete(Long studentId, Long userId);
}
