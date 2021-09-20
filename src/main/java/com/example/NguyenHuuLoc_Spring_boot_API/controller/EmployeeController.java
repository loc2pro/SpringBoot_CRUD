package com.example.NguyenHuuLoc_Spring_boot_API.controller;

import com.example.NguyenHuuLoc_Spring_boot_API.dto.EmployeeDTO;
import com.example.NguyenHuuLoc_Spring_boot_API.entity.Employee;
import com.example.NguyenHuuLoc_Spring_boot_API.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getListEmployee(){
        System.out.println(employeeService.findAll());
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable long id){
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        employee.setId(Long.valueOf(0));
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable long id){
        employeeService.deleteById(Long.valueOf(id));
        return "Deleted employee "+ id;
    }



}