package com.shopverse.ecommerce.entity;

import jakarta.persisrence.*;
import lombok.*;


@Entity
@Table(name ="users")
@Getter @Setter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private Long id;
    private String Name;

    @Column(unique=true)
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
