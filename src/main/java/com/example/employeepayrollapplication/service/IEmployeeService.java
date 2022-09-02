package com.example.employeepayrollapplication.service;

import com.example.employeepayrollapplication.dto.EmployeeDTO;
import com.example.employeepayrollapplication.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    public String welcomeMessage();
    public EmployeeEntity saveData(EmployeeDTO employee);
    public Optional<EmployeeEntity> findById(long id);
    public List<EmployeeEntity> recieveList();
    public EmployeeEntity editData(EmployeeEntity employee, long id);
    public EmployeeEntity deleteData(long id);
    public List<EmployeeEntity> getEmployeeDataByDepartment(String department);
}
