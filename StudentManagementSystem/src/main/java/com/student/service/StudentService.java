package com.student.service;

import java.util.List;
import com.student.model.Student;
public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public String deleteStudent(Integer id);
	public Student editStudent(Student student,Integer id);

}
