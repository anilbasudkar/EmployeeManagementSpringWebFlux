package com.akb.repository;

import com.akb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    public Employee findByFirstName(String firstName);
}
