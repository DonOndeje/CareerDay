package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.*;


public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {
       List<Applicant> findByUsername(String username);
}
