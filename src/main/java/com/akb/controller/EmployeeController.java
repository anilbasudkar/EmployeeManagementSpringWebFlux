package com.akb.controller;

import com.akb.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    @GetMapping(params = "empId")
    public Employee getEmployee(@RequestParam Integer empId){
        System.out.println("Param received is "+empId);
        Employee employee = new Employee();
        employee.setEmployeeId("10001");
        employee.setEmployeeFirstName("Anil");
        employee.setEmployeeLastName("Basudkar");
        return employee;
    }
}
