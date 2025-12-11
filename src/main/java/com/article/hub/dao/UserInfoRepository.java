package com.article.hub.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.article.hub.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByEmail(String email);
}
