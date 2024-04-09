package com.cryptolly.backend.repository;

import com.cryptolly.backend.entity.TransactionHistory;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionHistory, Long>{

}
