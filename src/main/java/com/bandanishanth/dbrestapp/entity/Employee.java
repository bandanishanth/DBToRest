package com.bandanishanth.dbrestapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "EMPLOYEE")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    @Getter @Setter
    private Long id;

    @Column(name = "EMP_NAME",nullable = false)
    @Getter @Setter
    private String name;
}
