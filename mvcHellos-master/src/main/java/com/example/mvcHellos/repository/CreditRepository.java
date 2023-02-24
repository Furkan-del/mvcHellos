package com.example.mvcHellos.repository;

import com.example.mvcHellos.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit,Long> {

}
