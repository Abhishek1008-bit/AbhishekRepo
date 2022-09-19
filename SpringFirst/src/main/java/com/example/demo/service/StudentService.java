package com.example.demo.service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepositary;
import com.example.demo.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepositary studentRepository;
	
	public Iterable<Student> getAllPageWise(int pageno, int count){
		Pageable pageable=PageRequest.of(pageno, count, Sort.by("rno"));
		return studentRepository.findAll(pageable);
	}
}
