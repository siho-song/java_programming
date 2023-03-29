package school;

import java.util.ArrayList;

public class School {

	private static School school = new School();
	private final static String schoolName = "Good School";
	
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	
	private School() {}

	public static School getInstance() {
		if(school == null) {
			school =new School();
		}
		return school;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}	
	
}
