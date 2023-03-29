package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateReport;
import utils.Define;


public class TestMain {

	School school = School.getInstance();
	Subject Korean;
	Subject Math;
	Subject Dance;
	
	GenerateReport gradeReport = new GenerateReport();
	
	public static void main(String[] args) {
		
		TestMain test = new TestMain();
		
		test.creatSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //성적 결과 생성
		System.out.println(report); // 출력
		

	}

	private void createStudent() {
		
		Student student1 = new Student(211213, "강감찬", Korean);
		Student student2 = new Student(212330, "김유신", Math);
		Student student3 = new Student(201518, "신사임당", Korean);
		Student student4 = new Student(202360, "이순신", Korean);
		Student student5 = new Student(201290, "홍길동", Math);
		
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);
		school.addStudent(student5);
		
		Korean.addStudent(student1);
		Korean.addStudent(student2);
		Korean.addStudent(student3);
		Korean.addStudent(student4);
		Korean.addStudent(student5);
		
		Math.addStudent(student1);
		Math.addStudent(student2);
		Math.addStudent(student3);
		Math.addStudent(student4);
		Math.addStudent(student5);
		
		Dance.addStudent(student1);
		Dance.addStudent(student2);
		Dance.addStudent(student3);
		
		addScoreForStudent(student1, Korean, 95); 
		addScoreForStudent(student1, Math, 56);	
		addScoreForStudent(student1, Dance, 95); 
		
		addScoreForStudent(student2, Korean, 95); 
		addScoreForStudent(student2, Math, 95);	
		addScoreForStudent(student2, Dance, 85); 
		
		addScoreForStudent(student3, Korean, 100); 
		addScoreForStudent(student3, Math, 88);	
		addScoreForStudent(student3, Dance, 55); 
		
		addScoreForStudent(student4, Korean, 89); 
		addScoreForStudent(student4, Math, 95);	
		
		addScoreForStudent(student5, Korean, 85); 
		addScoreForStudent(student5, Math, 56);
		
		
		
	}

	private void creatSubject() {
		
		Korean = new Subject(Define.KOREAN, "Korean");
		Math = new Subject(Define.MATH, "Math");
		Dance = new Subject(Define.DANCE,"Dance");
		Dance.setGradeType(Define.PF_EVAL);
		
		school.addSubject(Korean);
		school.addSubject(Math);
		school.addSubject(Dance);
		
	}	
	
	private void addScoreForStudent(Student student , Subject subject , int point) {
		Score score = new Score(student.getStudentId(), point, subject);
		student.addScore(score);
	}

}
