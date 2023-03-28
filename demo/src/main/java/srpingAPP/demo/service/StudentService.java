package srpingAPP.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srpingAPP.demo.StudentRequest;
import srpingAPP.demo.model.Student;
import srpingAPP.demo.schemes.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository repoStudent;
	
	public Student saveStudent(StudentRequest studentRequest){
		System.out.println(studentRequest.getName()+","+ studentRequest.getGroup()+","+ studentRequest.getAge()+","+studentRequest.getB_day()+","+studentRequest.getUid());
		Student student = Student.build(0,studentRequest.getName(), studentRequest.getGroup(), studentRequest.getAge(),studentRequest.getB_day(), studentRequest.getUid());
		System.out.println(student);
		return repoStudent.save(student);
	}
	
	public List<Student> getAllStudents(){
		return repoStudent.findAll();
	}
}
