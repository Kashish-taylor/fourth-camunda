package com.example.employee.repo;

import com.example.employee.entity.Employee;
import com.example.employee.entity.YoungEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YoungEmployeeRepository extends JpaRepository<YoungEmployee, String> {


}
