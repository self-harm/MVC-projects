package io.harmed.spring.springboot.spring_course_springboot.services;

import io.harmed.spring.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}