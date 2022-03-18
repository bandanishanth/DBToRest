package com.bandanishanth.dbrestapp.controller;

import com.bandanishanth.dbrestapp.entity.Employee;
import com.bandanishanth.dbrestapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("/all")
    public List<Employee> getAll()
    {
        return employeeRepository.findAll();
    }

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee)
    {
        employeeRepository.save(employee);
        return employee;
    }
}
