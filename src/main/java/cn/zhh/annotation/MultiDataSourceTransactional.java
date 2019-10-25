package cn.zhh.annotation;

import java.lang.annotation.*;

/**
 * 多数据源事务注解
 *
 * @author Zhou Huanghua
 * @date 2019/10/26 1:16
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MultiDataSourceTransactional {

    /**
     * 事务管理器数组
     */
    String[] transactionManagers();
}
