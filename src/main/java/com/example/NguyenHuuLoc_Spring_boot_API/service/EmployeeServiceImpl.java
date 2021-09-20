package com.example.NguyenHuuLoc_Spring_boot_API.service;


import com.example.NguyenHuuLoc_Spring_boot_API.entity.Employee;
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
    public Employee saveEmployee(Employee e) {
        employeeRepository.save(e);
        return e;
    }

    @Override
    public List<Employee> findAll() {

        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
        Optional<Employee> rs = employeeRepository.findById(Long.valueOf(id));
        Employee e = null;
        if(rs.isPresent()){
            e=rs.get();
        }else{
            throw new RuntimeException("Did not find");
        }
        return e;
    }

    @Override
    public void deleteById(long id) {
        employeeRepository.deleteById(Long.valueOf(id));
    }
}