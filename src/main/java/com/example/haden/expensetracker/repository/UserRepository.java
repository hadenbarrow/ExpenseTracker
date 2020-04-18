package com.example.haden.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.haden.expensetracker.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
