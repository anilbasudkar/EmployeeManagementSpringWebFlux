package com.akb.controller;

import com.akb.model.Employee;
import com.akb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;

    @GetMapping(params = "empId")
    public Employee getEmployee(@RequestParam Integer empId){
        System.out.println("Param received is "+empId);
        Employee employee = new Employee();
        employee.setEmployeeId("10001");
        employee.setFirstName("Anil");
        employee.setLastName("Basudkar");
        return employee;
    }
    @GetMapping()
    public List<Employee> getAllEmployees(){
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee("10001","Anil1","Basudkar1"));
//        employeeList.add(new Employee("10002","Anil2","Basudkar2"));
//        employeeList.add(new Employee("10003","Anil3","Basudkar3"));
//        return employeeList;
        return repository.findAll();
    }
    @PostMapping()
    public void addEmpleyee(@RequestBody Employee employee){
        repository.save(employee);

    }
}
