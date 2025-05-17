package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.model.Student;
import com.student.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student.getStudentEmail());
		return studentRepo.save(student);
	}
	
	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
        Student student=studentRepo.findById(id).get();
		
		if(student!=null) {
			studentRepo.delete(student);
			return "Product Delete Sucessfully";
		}
		return "Something wrong on server";
	}

	@Override
	public Student editStudent(Student p, Integer id) {
		// TODO Auto-generated method stub
		Student oldStudent = studentRepo.findById(id).get();

		oldStudent.setStudentName(p.getStudentName());
		oldStudent.setStudentAge(p.getStudentAge());
		oldStudent.setStudentPhone(p.getStudentPhone());
		oldStudent.setStudentEmail(p.getStudentEmail());

		return studentRepo.save(oldStudent);
	}

}
