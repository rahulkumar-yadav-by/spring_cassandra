package com.spring.cassandra.springCassandra.repository;

import com.spring.cassandra.springCassandra.model.ListModel;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ListRepostitory extends CassandraRepository<ListModel, Integer> {

}

