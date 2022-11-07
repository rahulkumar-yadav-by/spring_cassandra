package com.spring.cassandra.springCassandra.model;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Set;

@Table
public class SetModel {

    @PrimaryKey
    private int id;

    private String name;
    private Set<String> mobile;
}
