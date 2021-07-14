package com.example.employee.controller;


import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployee/{name}")
    public ResponseEntity<Employee> getEmployee(@PathVariable String name) throws JsonProcessingException {
        Employee employee = employeeService.getEmployee(name);
        System.out.println(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) throws JsonProcessingException {
        employeeService.saveEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @PostMapping("/saveOldEmployee")
    public ResponseEntity<Employee> saveOldEmployee(@RequestBody Employee employee) throws JsonProcessingException {
        employeeService.saveOldEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
    @PostMapping("/saveYoungEmployee")
    public ResponseEntity<Employee> saveYoungEmployee(@RequestBody Employee employee) throws JsonProcessingException {
        employeeService.saveYoungEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
}
