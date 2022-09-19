package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Student;

public interface StudentRepositary extends PagingAndSortingRepository<Student, Integer>{
	public List<Student> findByBranch(String branch);

	public List<Student> findByBranchAndSemester(String branch, int semester);

	public List<Student> findBySemesterBetween(int start, int end);
}
