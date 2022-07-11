package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.models.Transection;
@Repository
public interface TransectionDao extends JpaRepository<Transection, Integer> {

	List<Transection> findByAccno(int accno );

	
}
