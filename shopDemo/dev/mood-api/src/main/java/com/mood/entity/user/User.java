package com.mood.entity.user;

import com.mood.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体
 * @author chaiwei
 * @time 2018-01-07 下午08:00
 */
@Data
@Table(name = "ethico_user")
public class User extends BaseEntity {

    @Id
    private String id;

    private String username;

    private String email;

    private String mobile;

    private String password;

    private String savedSecret;

    private Double ethNumber;

    private Double couponNumber;

}