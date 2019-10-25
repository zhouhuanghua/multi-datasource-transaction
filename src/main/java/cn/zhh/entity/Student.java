package cn.zhh.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生实体类
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:06
 */
@Data
public class Student implements Serializable {

    private Long id;

    private String name;

    private String code;

    private Byte sex;

    private Date createTime;

    private Date lastUpdateTime;

    private Byte isDeleted;
}
