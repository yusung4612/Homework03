package com.sparta.postcomment.repository;

import com.sparta.postcomment.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepositroy extends JpaRepository<RefreshToken, String> {
}
