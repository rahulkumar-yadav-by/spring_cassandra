package com.spring.cassandra.springCassandra.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;

@Table
public class ListModel {

    @PrimaryKey
    private int id;

    private String name;
    private List<String> mobile;
}
