package com.java.devpilotwork.backend.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;

@Entity
@Setter
@Getter
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="github_id",nullable = false, unique = true,length = 200)
    private String githubId;

    @Column(name = "github_username", nullable = false,length = 200)
    private String githubUsername;

    @Column(name = "avatar_url",length = 500)
    private String avatarUrl;

    @Column(name = "access_token",nullable = false, columnDefinition = "TEXT")
    private String accessToken;

    @Column(name = "token_scopes",length = 500)
    private String tokenScopes;

    @Column(name = "created_at",nullable = false, updatable = false)
    private Instant createdAt;

    @PrePersist
    void onCreate(){
        if(createdAt==null){
            createdAt= Instant.now();
        }
    }

}
