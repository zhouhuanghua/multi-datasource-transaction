package cn.zhh.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据源配置
 *
 * @author Zhou Huanghua
 * @date 2019/10/26 0:24
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @Primary
    public DataSource dataSource(@Value("${spring.datasource.username}") String username,
                                 @Value("${spring.datasource.password}") String password,
                                 @Value("${spring.datasource.url}") String url,
                                 @Value("${spring.datasource.driver-class-name}") String driverClassName) {
        return createDataSource(username, password, url, driverClassName);
    }

    @Bean
    public DataSource dataSource2(@Value("${spring.datasource2.username}") String username,
                                  @Value("${spring.datasource2.password}") String password,
                                  @Value("${spring.datasource2.url}") String url,
                                  @Value("${spring.datasource2.driver-class-name}") String driverClassName) {
        return createDataSource(username, password, url, driverClassName);
    }

    private DataSource createDataSource(String username, String password, String url, String driverClassName) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }
}
