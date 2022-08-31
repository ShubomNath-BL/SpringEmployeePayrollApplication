package com.example.employeepayrollapplication.dto;

import com.example.employeepayrollapplication.entity.EmployeeEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDTO {

    private String message;
    private Object obj;

    public ResponseDTO(String string, EmployeeEntity response) {
        this.message = string;
        this.obj = response;
    }
}
