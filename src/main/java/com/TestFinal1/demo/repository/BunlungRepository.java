package com.TestFinal1.demo.repository;

import com.TestFinal1.demo.entity.BunlungEntity;
import com.TestFinal1.demo.model.BunlungModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface BunlungRepository extends JpaRepository<BunlungEntity, Timestamp> {
}
