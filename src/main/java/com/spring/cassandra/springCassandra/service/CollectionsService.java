package com.spring.cassandra.springCassandra.service;


import com.spring.cassandra.springCassandra.model.ListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionsService {

//    private int id;
//    private String name;
//    private List<String> mobile;

    @Autowired
    CassandraOperations cassandraOperations;


    // INSERT QUERY
//    public ResponseEntity<ListModel> addListModel(ListModel inputModel){
//
//        ListModel listModel = new ListModel();
//        cassandraOperations.insert(listModel);
//
//
//    }


}
