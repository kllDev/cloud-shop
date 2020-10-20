package com.kll.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shop_loginUser")
@Data
public class LoginUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
