package com.example.Waffle.repository;

import com.example.Waffle.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<userEntity, Long> {

    //email로 user 정보 찾기
    Optional<userEntity> findByemail(String email);
}
