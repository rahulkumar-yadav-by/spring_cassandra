package com.spring.cassandra.springCassandra.Controller;

import com.spring.cassandra.springCassandra.model.Employee;
import com.spring.cassandra.springCassandra.model.ListModel;
import com.spring.cassandra.springCassandra.model.MapModel;
import com.spring.cassandra.springCassandra.model.SetModel;
import com.spring.cassandra.springCassandra.repository.ListRepostitory;
import com.spring.cassandra.springCassandra.repository.MapRepostiory;
import com.spring.cassandra.springCassandra.repository.SetRepository;
import com.spring.cassandra.springCassandra.service.CollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collection")
public class CollectionsController {

    @Autowired
    CollectionsService service;

    public CollectionsController(CollectionsService service){
        this.service = service;
    }


//    @PostMapping("/list/add-user")
//    public ResponseEntity<ListModel> addListModel(@RequestBody ListModel inputModel){
//        return service.addListModel(inputModel);
//    }




}
