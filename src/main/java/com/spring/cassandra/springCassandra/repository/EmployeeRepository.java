package com.spring.cassandra.springCassandra.repository;

import com.spring.cassandra.springCassandra.model.Employee;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Component
public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {

    @AllowFiltering
    List<Employee> findByName(String name);
}
