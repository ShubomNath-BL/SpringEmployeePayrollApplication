package com.example.employeepayrollapplication.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class EmployeeDTO {

    private String employeeName;
    private String profilePic;
    private String gender;
    private long salary;
    private String department;
    private LocalDate startDate;

}
