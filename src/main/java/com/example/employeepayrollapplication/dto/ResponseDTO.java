package com.example.employeepayrollapplication.dto;

import com.example.employeepayrollapplication.entity.EmployeeEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ResponseDTO {

    private String message;
    private Object obj;

    public ResponseDTO(String string, EmployeeEntity response) {
        this.message = string;
        this.obj = response;
    }


    public ResponseDTO(String string1, String errMsg) {
        this.message = string1;
        this.obj = errMsg;
    }

    public ResponseDTO(String message, List<EmployeeEntity> empList) {
        this.message = message;
        this.obj = empList;
    }
}
