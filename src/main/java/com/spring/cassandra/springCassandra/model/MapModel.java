package com.spring.cassandra.springCassandra.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Map;
import java.util.Set;


@Table
public class MapModel {
    @PrimaryKey
    private int id;

    private String name;

    private Map<String,Long> mobile;
}
