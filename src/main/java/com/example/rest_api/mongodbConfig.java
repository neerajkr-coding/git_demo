package com.example.rest_api;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class mongodbConfig {

//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(new SimpleMongoClientDatabaseFactory(MongoClients.create("mongodb://localhost:27017"), "MyDatabase"));
//    }


}
