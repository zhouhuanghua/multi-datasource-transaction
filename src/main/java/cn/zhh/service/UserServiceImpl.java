package cn.zhh.service;

import cn.zhh.entity.User;
import cn.zhh.mapper2.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务实现类
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(transactionManager = "dataSourceTransactionManager2")
    public void insert(User user) {
        int insertCount = userMapper.insert(user);
        if (insertCount < 1) {
            throw new RuntimeException("用户记录插入失败！");
        }
//        int i = 1 / 0;
    }

    @Override
    public void deleteById(Long id) {
        int deleteCount = userMapper.deleteById(id);
        if (deleteCount < 1) {
            throw new RuntimeException("用户记录删除失败！");
        }
    }
}
