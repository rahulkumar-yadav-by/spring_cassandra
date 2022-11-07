package com.spring.cassandra.springCassandra.service;

import com.spring.cassandra.springCassandra.model.Employee;
import com.spring.cassandra.springCassandra.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;


    public ResponseEntity<Employee> addEmployee(Employee employee){
        try{
//            Employee tempEmployee = repository.save(new Employee(UUID.randomUUID(),
//                    employee.getName(),
//                    employee.getEmail(),
//                    employee.getState())
//            );
            Employee tempEmployee = repository.save(employee);
            return new ResponseEntity<>(tempEmployee, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    public List<Employee> getEmployeeByName(String name){
//        return repository.findByName(name);
//    }
}
