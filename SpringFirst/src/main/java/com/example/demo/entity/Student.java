package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	private int rno;
	private String name;
	private String branch;
	private int semester; 

}
