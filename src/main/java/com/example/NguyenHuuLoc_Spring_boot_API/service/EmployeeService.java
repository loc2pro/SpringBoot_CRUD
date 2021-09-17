package com.example.NguyenHuuLoc_Spring_boot_API.service;


import com.example.NguyenHuuLoc_Spring_boot_API.entity.Employee;

import java.util.List;


public interface EmployeeService {
    void saveEmployee(Employee e);
    List<Employee> findAll();
    Employee findById(long id);
    void deleteById(long id);
}
