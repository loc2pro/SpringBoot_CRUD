package com.example.NguyenHuuLoc_Spring_boot_API.dto;

import com.example.NguyenHuuLoc_Spring_boot_API.entity.Employee;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EmployeeDTO {

    private String firstName;
    private String lastName;

    public EmployeeDTO(Employee e){
        this.firstName = e.getFirst_name();
        this.lastName = e.getLast_name();
    }
}