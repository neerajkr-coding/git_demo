package com.example.rest_api;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private MongoTemplate mongoTemplate;


    public Students createStudent(Students students) {
        return mongoTemplate.save(students);
    }


    public List<Students> getAllStudent() {
        return mongoTemplate.findAll(Students.class);
    }


}
