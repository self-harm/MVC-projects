package io.harmed.spring.springboot.spring_course_springboot.controllers;

import io.harmed.spring.springboot.spring_course_springboot.entity.Employee;
import io.harmed.spring.springboot.spring_course_springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);

        return employee;
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);

        return "Employee with ID = " + id + " was deleted";
    }

    @RequestMapping("/q")
    public String fwf() {
        return "one";
    }
}
