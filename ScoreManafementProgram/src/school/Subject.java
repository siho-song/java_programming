package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {
	
	private int subjectId ;
	
	private String subjectName ;
	
	private int gradeType; 
	
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(int subjectId , String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_EVAL;
	}
	
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	

	public void addStudent(Student student) {
		studentList.add(student);
	}
}
