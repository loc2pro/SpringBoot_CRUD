package com.example.NguyenHuuLoc_Spring_boot_API.service;


import com.example.NguyenHuuLoc_Spring_boot_API.entity.Employee;
import com.example.NguyenHuuLoc_Spring_boot_API.error.EmployeeNotFoundException;
import com.example.NguyenHuuLoc_Spring_boot_API.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public List<Employee> findAll() {

        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) throws EmployeeNotFoundException {
        Optional<Employee> rs = employeeRepository.findById(Long.valueOf(id));
        //Employee e = null;
        if(!rs.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found!");
        }
        return rs.get();
    }

    @Override
    public void deleteById(long id) {
        employeeRepository.deleteById(Long.valueOf(id));
    }
}