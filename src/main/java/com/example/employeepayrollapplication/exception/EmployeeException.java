package com.example.employeepayrollapplication.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeException extends RuntimeException{
    private String message;
}
