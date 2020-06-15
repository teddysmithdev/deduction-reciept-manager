package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Deduction;

@Repository
public interface DeductionRepository extends JpaRepository<Deduction, Long> {

}
