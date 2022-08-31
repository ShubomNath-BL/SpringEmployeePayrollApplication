package com.example.employeepayrollapplication.controller;

import com.example.employeepayrollapplication.dto.EmployeeDTO;
import com.example.employeepayrollapplication.entity.EmployeeEntity;
import com.example.employeepayrollapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public EmployeeEntity addEmployee(@RequestBody EmployeeDTO employee){
        EmployeeEntity response = service.saveData(employee);
        return response;
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
