package com.jpmc.midascore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpmc.midascore.entity.TransactionRecord;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionRecord, Long> {
} 