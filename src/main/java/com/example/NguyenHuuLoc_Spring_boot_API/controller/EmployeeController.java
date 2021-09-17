package com.example.NguyenHuuLoc_Spring_boot_API.controller;

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

}

