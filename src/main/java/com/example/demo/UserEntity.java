package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "USER")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_seq;

    @Column(name="username", length=64)
    private String username;
    @Column(name="password", length=128)
    private String password;
    @Column(name="full_name", length=32)
    private String fullName;
    @Column(name="email", length=64)
    private String email;
    @Column(name="mobile", length=13)
    private String mobile;
    @Column(name="active")
    private boolean active;
    @Column(name="provider", length=32)
    private String provider;
    @Column(name="provider_id", length=100)
    private String providerId;
    @Column(name="created_by", length=8)
    private String createdBy;
    @Column(name="created_at")
    private LocalDateTime createdAt;

}
