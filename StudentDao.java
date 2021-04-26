package com.springjdbc.dao;

import java.util.List;

import com.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
	public int del(Student student);
}

