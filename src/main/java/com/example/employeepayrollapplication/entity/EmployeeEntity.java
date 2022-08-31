package com.example.employeepayrollapplication.entity;


import com.example.employeepayrollapplication.dto.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private long employeeId;
    private String employeeName;
    private String profilePic;
    private String gender;
    private long salary;
    private String department;
    private LocalDate startDate;

    public EmployeeEntity(EmployeeDTO employee) {
        this.employeeName = employee.getEmployeeName();
        this.profilePic = employee.getProfilePic();
        this.gender = employee.getGender();
        this.salary = employee.getSalary();
        this.department = employee.getDepartment();
        this.startDate = employee.getStartDate();
    }
}
