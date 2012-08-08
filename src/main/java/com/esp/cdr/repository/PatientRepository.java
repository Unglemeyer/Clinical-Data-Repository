package com.esp.cdr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esp.cdr.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
}