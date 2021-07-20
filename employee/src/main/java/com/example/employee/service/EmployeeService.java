package com.example.employee.service;


import com.example.employee.entity.Employee;
import com.example.employee.entity.OldEmployee;
import com.example.employee.entity.YoungEmployee;
import com.example.employee.repo.EmployeeRepository;
import com.example.employee.repo.OLdEmployeeRepository;
import com.example.employee.repo.YoungEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private OLdEmployeeRepository oLdEmployeeRepository;

    @Autowired
    private YoungEmployeeRepository youngEmployeeRepository;


    public Employee getEmployee(String employeeName) {
        Employee employee = employeeRepository.findById(employeeName).get();
        return employee;

    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void saveOldEmployee(Employee employee) {
        OldEmployee oldEmployee=new OldEmployee(employee.getName(),employee.getAge(),employee.getPensionAmount(),employee.getVoterId(),employee.getRasanCard());
        oLdEmployeeRepository.save(oldEmployee);
    }

    public void saveYoungEmployee(Employee employee) {
        YoungEmployee youngEmployee=new YoungEmployee(employee.getName(),employee.getAge(),employee.getPensionAmount(),employee.getVoterId(),employee.getRasanCard());
        youngEmployeeRepository.save(youngEmployee);
    }
}
