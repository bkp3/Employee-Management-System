package com.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
