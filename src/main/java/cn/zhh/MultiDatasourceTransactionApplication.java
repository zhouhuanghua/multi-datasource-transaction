package cn.zhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(basePackages = "cn.zhh.mapper.**") 单独在MybatisConfig里面配置
@SpringBootApplication
public class MultiDatasourceTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiDatasourceTransactionApplication.class, args);
    }

}
