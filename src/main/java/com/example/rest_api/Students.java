package com.example.rest_api;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Entity
@Document(collection = "students")
//@Data
public class Students {

    @Id
    private ObjectId id;

    private int idx;

    private String name;
    private int age;

//    public ObjectId getId() {
//        return id;
//    }
//
//    public void setId(ObjectId id) {
//        this.id = id;
//    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public Students(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
}
