package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//we create a model to handle database data 
@Entity
@Table(name = "USERS", catalog = "careerday")
public class Applicant {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) // this value on the table will be an auto generated value
    @Column(name = "id") // annotated with a column name 'id'
	private int id;
	
	
	@Column(name = "firstname")
    private String firstname;
	
	@Column(name = "lastname")
    private String lastname;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "phone")
    private String phone;
	
	@Column(name = "educational_level")
    private String educational_level;
	
	@Column(name = "yearsExperience")
    private String yearsExperience;
	
	

}
