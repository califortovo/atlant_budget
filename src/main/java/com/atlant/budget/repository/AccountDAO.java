package com.atlant.budget.repository;

import com.atlant.budget.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountDAO extends JpaRepository<Account, Long> {
    Optional<Account> findById(Long id);
}