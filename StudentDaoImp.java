package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entities.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	//data inserted
	
	/*public int insert(Student student)
	{
		String query = "insert into save(id,name,address)values(?,?,?)";
		int i = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		
		return i;
	}*/
	//data updating
	/*public int change(Student student)
	{
		String query ="update save set name=?, address=? where id=?";
		int i = this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return i;
	}*/
	
   public int del(Student student)
	{
	   String query = "delete from save where id=22";
	   int i = this.jdbcTemplate.update(query);
		return i;
		
	}
	
	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public int insert(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int changeup(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public int change(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}
}
