package com.example.NguyenHuuLoc_Spring_boot_API.service;


import com.example.NguyenHuuLoc_Spring_boot_API.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    Employee saveEmployee(Employee e);
    List<Employee> findAll();
    Employee findById(long id);
    void deleteById(long id);
}
