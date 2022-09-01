package com.example.employeepayrollapplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollApplication.class, args);
        System.out.println("Welcome to the Employee payroll Application");
        System.out.println("--------------------------------------------");
        log.info("Hello dear logger........!");
    }

}
