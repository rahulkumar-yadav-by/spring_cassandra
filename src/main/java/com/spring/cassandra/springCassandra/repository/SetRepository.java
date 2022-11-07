package com.spring.cassandra.springCassandra.repository;

import com.spring.cassandra.springCassandra.model.SetModel;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface SetRepository extends CassandraRepository<SetModel, Integer> {

}
