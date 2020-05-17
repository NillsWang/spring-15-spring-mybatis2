package com.wmz.dao;

import java.util.List;

import com.wmz.bean.Student;

public interface IStudentDao {
	
	void insertStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);

	List<Student> selectAllStudents();
	Student selectStudentById(int id);

}
