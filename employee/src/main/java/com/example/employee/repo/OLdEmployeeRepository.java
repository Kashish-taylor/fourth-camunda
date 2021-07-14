package com.example.employee.repo;

import com.example.employee.entity.Employee;
import com.example.employee.entity.OldEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OLdEmployeeRepository extends JpaRepository<OldEmployee, String> {


}
