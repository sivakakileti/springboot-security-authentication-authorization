package com.spring.authentication.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "APPUSER")
@Data
public class AppUser {

    @Id
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_name")
    private String userName;
    @Column (name = "password")
    String password;
    @Column(name="roles")
    String roles;
}
