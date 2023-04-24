package com.example.Waffle.repository;

import com.example.Waffle.entity.DM.DmEntity;
import com.example.Waffle.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DmRepository extends JpaRepository<DmEntity, Long> {

    Optional<DmEntity> findById(int id);
}
