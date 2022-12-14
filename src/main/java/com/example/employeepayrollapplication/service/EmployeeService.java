package com.example.employeepayrollapplication.service;

import com.example.employeepayrollapplication.dto.EmployeeDTO;
import com.example.employeepayrollapplication.entity.EmployeeEntity;
import com.example.employeepayrollapplication.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    Repo repository;
    public String welcomeMessage() {
        return "Hello this is employee payroll app";
    }

    public EmployeeEntity saveData(EmployeeDTO employee) {
        EmployeeEntity newEmployee = new EmployeeEntity(employee);
        repository.save(newEmployee);
        return newEmployee;
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

    @Override
    public List<EmployeeEntity> getEmployeeDataByDepartment(String department) {
        return repository.findEmployeeByDepartment(department);
    }
}
