package com.example.haden.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.haden.expensetracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
