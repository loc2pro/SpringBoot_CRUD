package com.example.NguyenHuuLoc_Spring_boot_API.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    @NotBlank(message = "Please add firstName")
    @Length(min = 1,max = 15,message = "less than 15 and greater than one")
    private String first_name;


    @NotBlank(message = "Please add lassName")
    @Length(min = 1,max = 15,message = "less than 15 and greater than one")
    @Column(name = "last_name")
    private String last_name;

    @Email(message = "Please Input Email")
    @Column(name = "email")
    private String email;
}
