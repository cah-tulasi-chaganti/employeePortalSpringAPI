package com.employees.employeePortal;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employees.employeePortal.bean.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
    private EmployeeRepository repo;
     
    public List<Employee> listAll() {
        return (List<Employee>) repo.findAll();
    }
     
    public void save(Employee employee) {
        repo.save(employee);
    }
     
    public Employee get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
