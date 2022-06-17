package com.example.EXAM_WCD_SEM4_2.model;

import com.example.EXAM_WCD_SEM4_2.entity.Employee;

import java.util.List;

public interface EmployeeModel {
    boolean save(Employee obj);
    List<Employee> findAll();
}
