package com.example.employeepayrollapplication.repo;

import com.example.employeepayrollapplication.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<EmployeeEntity, Long> {
}
