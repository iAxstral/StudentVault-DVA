package com.studentvault.dva.repository;

import com.studentvault.dva.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    
    Optional<Student> findByUsername(String username);
}