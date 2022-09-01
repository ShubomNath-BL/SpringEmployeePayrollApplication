package com.example.employeepayrollapplication.controller;

import com.example.employeepayrollapplication.dto.EmployeeDTO;
import com.example.employeepayrollapplication.dto.ResponseDTO;
import com.example.employeepayrollapplication.entity.EmployeeEntity;
import com.example.employeepayrollapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @RequestMapping(value = {"", "/", "hello"}, method = RequestMethod.GET)
    public String welcome(){
        return "Welcome to Employee payroll app";
    }

    @GetMapping("/greet")
    public String greet(){
        return service.welcomeMessage();
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseDTO> addEmployee(@Valid @RequestBody EmployeeDTO employee){
        EmployeeEntity response = service.saveData(employee);
        ResponseDTO responseDTO = new ResponseDTO("Data posted Successfully", response);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public Optional<EmployeeEntity> empById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/list")
    public List<EmployeeEntity> getAllData(){
        List<EmployeeEntity> response = service.recieveList();
        return response;
    }

    @PutMapping("/edit/{id}")
    public EmployeeEntity editEmpData(@RequestBody EmployeeEntity employee, @PathVariable long id){
        return service.editData(employee, id);
    }

    @GetMapping("delete/{id}")
    public EmployeeEntity deleteEmpData(@PathVariable long id){
        return service.deleteData(id);
    }
}
