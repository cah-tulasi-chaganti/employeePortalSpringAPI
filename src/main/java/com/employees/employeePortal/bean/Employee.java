package com.employees.employeePortal.bean;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "employee")
public class Employee {

    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "emprole")
    private String emprole;
    @Column(name = "empprofile")
    private String empprofile;
    @Column(name = "department")
    private String department;
    @Column(name = "address")
    private String address;


    Employee() {
    }

    Employee(int id, String firstname, String lastname, String profile, String role, String department, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emprole = role;
        this.empprofile = profile;
        this.department = department;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmprole() {
        return emprole;
    }

    public void setEmprole(String emprole) {
        this.emprole = emprole;
    }

    public String getEmpprofile() {
        return empprofile;
    }

    public void setEmpprofile(String empprofile) {
        this.empprofile = empprofile;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firstname, employee.firstname)
                && Objects.equals(this.emprole, employee.empprofile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstname, this.emprole);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.firstname + " " + this.lastname + '\'' + ", role='" + this.emprole + '\'' + '}';
    }
}