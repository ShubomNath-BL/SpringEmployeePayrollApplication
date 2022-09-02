package com.example.employeepayrollapplication.entity;


import com.example.employeepayrollapplication.dto.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee_entity")
@Data
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @Column(name = "employee_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;
    @Column(name = "employeeName")
    private String employeeName;
    private String profilePic;
    private String gender;
    private long salary;

    private LocalDate startDate;

    @ElementCollection
    @CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> department;

    public EmployeeEntity(EmployeeDTO employee) {
        this.employeeName = employee.getEmployeeName();
        this.profilePic = employee.getProfilePic();
        this.gender = employee.getGender();
        this.salary = employee.getSalary();
        this.department = employee.getDepartment();
        this.startDate = employee.getStartDate();
    }
}
