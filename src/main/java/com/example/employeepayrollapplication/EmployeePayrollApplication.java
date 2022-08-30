package com.example.employeepayrollapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeePayrollApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee payroll Application");
        SpringApplication.run(EmployeePayrollApplication.class, args);
    }

}
