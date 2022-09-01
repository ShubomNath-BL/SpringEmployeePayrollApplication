package com.example.employeepayrollapplication.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class EmployeeDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Name")
    private String employeeName;
    private String profilePic;
    @NotNull(message = "Gender should not be empty")
    private String gender;
    @Min(value = 300000, message = "Invalid Salary")
    private long salary;
    private String department;
    private LocalDate startDate;

}
