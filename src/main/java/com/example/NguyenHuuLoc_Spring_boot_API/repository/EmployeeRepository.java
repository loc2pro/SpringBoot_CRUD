package com.example.NguyenHuuLoc_Spring_boot_API.repository;

import com.example.NguyenHuuLoc_Spring_boot_API.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
