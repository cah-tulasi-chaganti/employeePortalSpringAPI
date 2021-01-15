package com.employees.employeePortal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employees.employeePortal.bean.*;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
