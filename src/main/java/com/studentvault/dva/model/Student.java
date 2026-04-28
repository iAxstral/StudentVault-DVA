package com.studentvault.dva.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "students")
public class Student {

    @Id
    private String id;
    
    private String name;
    
    private String email;
    
    private String username;    
    // we will save the password as unencrypted plain text. this is a first version. Later we will use encryption.
    private String passwordMaster;
    
    private String role; //admin or user 

}