package com.spring.cassandra.springCassandra.repository;

import com.spring.cassandra.springCassandra.model.MapModel;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface MapRepostiory extends CassandraRepository<MapModel, Integer> {

}
