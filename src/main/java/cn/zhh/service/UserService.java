package cn.zhh.service;

import cn.zhh.entity.User;

/**
 * 用户服务接口
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:22
 */
public interface UserService {

    /**
     * 插入一条用户记录
     *
     * @param user 用户信息
     */
    void insert(User user);

    /**
     * 根据id删除用户记录
     *
     * @param id 用户id
     */
    void deleteById(Long id);
}
