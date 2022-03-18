package com.bandanishanth.dbrestapp.repository;

import com.bandanishanth.dbrestapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}