package com.priya.spring.mongo.api.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.priya.spring.mongo.api.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {

}
