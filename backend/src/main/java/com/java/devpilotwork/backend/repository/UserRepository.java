package com.java.devpilotwork.backend.repository;

import com.java.devpilotwork.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public Optional<User> findByGithubId(String githubId);
}
