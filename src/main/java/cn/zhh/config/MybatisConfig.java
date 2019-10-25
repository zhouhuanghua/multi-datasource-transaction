package cn.zhh.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * MybatisConfig配置类
 *
 * @author Zhou Huanghua
 * @date 2019/10/26 0:31
 */
public class MybatisConfig {

    @Configuration
    @MapperScan(
            basePackages = "cn.zhh.mapper",
            sqlSessionTemplateRef = "sqlSessionTemplate")
    public static class Db1 {

        @Bean
        @Primary
        public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(dataSource);
            return factoryBean.getObject();
        }

        @Bean
        @Primary
        public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
            return new SqlSessionTemplate(sqlSessionFactory);
        }

        @Bean
        @Primary
        public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("dataSource") DataSource dataSource) {
            return new DataSourceTransactionManager(dataSource);
        }
    }

    @Configuration
    @MapperScan(
            basePackages = "cn.zhh.mapper2",
            sqlSessionTemplateRef = "sqlSessionTemplate2")
    public static class Db2 {

        @Bean
        public SqlSessionFactory sqlSessionFactory2(@Qualifier("dataSource2") DataSource dataSource) throws Exception {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(dataSource);
            return factoryBean.getObject();
        }

        @Bean
        public SqlSessionTemplate sqlSessionTemplate2(@Qualifier("sqlSessionFactory2") SqlSessionFactory sqlSessionFactory) throws Exception {
            return new SqlSessionTemplate(sqlSessionFactory);
        }

        @Bean
        public DataSourceTransactionManager dataSourceTransactionManager2(@Qualifier("dataSource2") DataSource dataSource) {
            return new DataSourceTransactionManager(dataSource);
        }
    }
}
