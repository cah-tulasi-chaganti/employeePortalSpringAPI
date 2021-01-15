package com.employees.employeePortal;

import java.util.*;

import com.employees.employeePortal.bean.EmployeeRequest;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
import com.employees.employeePortal.bean.Employees;
import com.employees.employeePortal.bean.Employee;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class EmployeeController {
	@Autowired
    private EmployeeService service;
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/employees")
	public Employees list() {
		System.out.println("started the service");
		Employees data = new Employees();
		data.setData(service.listAll());
	    return data;
	}
	// RESTful API methods for Retrieval operations for one employee
	@GetMapping("/employees/{id}")
	public Employees get(@PathVariable Integer id) {
		Employees datEmpID = new Employees();
		try {
	        Employee product = service.get(id);	        
	        List<Employee> empIDList = new ArrayList<Employee>();	       
	        empIDList.add(product);
	        datEmpID.setData(empIDList);
	        
	        return datEmpID;
	    } catch (NoSuchElementException e) {
	        return datEmpID;
	    }      
	}
	// RESTful API method for Create operation
	@PostMapping("/employees")
	public String add(@RequestBody EmployeeRequest request) {
		String empAdd = "";
		System.out.println("add emp");
		System.out.println("employee"+request.getEmployee().getFirstname());
		try {
			System.out.println("employee"+request.getEmployee().getFirstname());
			service.save(request.getEmployee());
			empAdd = "Employee added successfully";
		}catch (Exception e) {
			// TODO: handle exception
			empAdd = "Error occurred while adding an employee" +e.getMessage();
		}
	    return empAdd;
	}
		
	// RESTful API method for Update operation
	@PutMapping("employees/{id}")
	public String updateEmployee(@PathVariable(value="id") int id, @RequestBody Employee employee)
	{
		String empUpdateMsg = "";
		try {
			Optional<Employee> employeeUpdate = Optional.ofNullable(service.get(id));
			Employee emp_new = employeeUpdate.get();
			emp_new.setFirstname(employee.getFirstname());
			emp_new.setLastname(employee.getLastname());
			emp_new.setEmprole(employee.getEmprole());
			emp_new.setEmpprofile(employee.getEmpprofile());
			emp_new.setDepartment(employee.getDepartment());
			emp_new.setAddress(employee.getAddress());
			service.save(emp_new);
			empUpdateMsg = "Employee " +id+ " is successfully updated";
		}catch (Exception e) {
			empUpdateMsg = "Error Occured while updating the employee due to:"+e.getMessage();
			// TODO: handle exception
		}
		
		return empUpdateMsg;
	}
	
     

}
