package com.example.employeepayrollapplication.repo;

import com.example.employeepayrollapplication.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<EmployeeEntity, Long> {
    @Query(value = "select * from employeepayrollapp.employee_department,employeepayrollapp.employee_entity where employee_entity.employee_id=employee_department.id and department= :department", nativeQuery = true)
    List<EmployeeEntity> findEmployeeByDepartment(String department);
}
