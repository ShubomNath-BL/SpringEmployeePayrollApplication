package com.example.employeepayrollapplication.service;

import com.example.employeepayrollapplication.entity.EmployeeEntity;
import com.example.employeepayrollapplication.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    Repo repository;
    public String welcomeMessage() {
        return "Hello this is employee payroll app";
    }

    public EmployeeEntity saveData(EmployeeEntity employee) {
        repository.save(employee);
        return employee;
    }

    public Optional<EmployeeEntity> findById(long id) {
        return repository.findById(id);
    }

    public List<EmployeeEntity> recieveList() {
        List<EmployeeEntity> response = repository.findAll();
        return response;
    }

    public EmployeeEntity editData(EmployeeEntity employee, long id) {
        EmployeeEntity existingEmp = findById(id).orElse(null);
        if (existingEmp != null){
            existingEmp.setEmployeeName(employee.getEmployeeName());
            existingEmp.setDepartment(employee.getDepartment());
            existingEmp.setGender(employee.getGender());
            existingEmp.setSalary(employee.getSalary());
            existingEmp.setProfilePic(employee.getProfilePic());
            existingEmp.setStartDate(employee.getStartDate());
            return repository.save(existingEmp);
        }
        else return null;
    }

    public EmployeeEntity deleteData(long id) {
        repository.deleteById(id);
        return null;
    }
}
