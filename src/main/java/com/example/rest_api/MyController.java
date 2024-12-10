package com.example.rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class MyController {

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }

    @Autowired
    private StudentService studentService;

    @GetMapping("/get")
    public List<Students> getAll(){
//        System.out.println(studentService.getAllStudent().get(0).getName());
        return studentService.getAllStudent();
    }

    @PostMapping("/post")
    public Students createUser(@RequestBody Students students) {
        return studentService.createStudent(students);
    }
}
