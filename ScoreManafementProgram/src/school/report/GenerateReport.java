package school.report;

import java.util.ArrayList;

import evaluation.BasicEvaluation;
import evaluation.GradeEvaluation;
import evaluation.MajorEvaluation;
import evaluation.PassFailEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;



public class GenerateReport {
	private School school = School.getInstance();
	
	private static final String TITLE = " 수강생 학점 \t\t\n";
	private static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
	private static final String LINE = "-------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateReport.LINE);
		buffer.append("\t"+subject.getSubjectName());
		buffer.append(GenerateReport.TITLE);
		buffer.append(GenerateReport.HEADER);
		buffer.append(GenerateReport.LINE);
	}
	
	public void makeBody(Subject subject) {
		
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajor().getSubjectName() + "\t");
			buffer.append(" | ");
		
			getScoreGrade(subject.getSubjectId(),student);
			
			buffer.append("\n");
			buffer.append(GenerateReport.LINE);
		}
	}
	
	public void getScoreGrade(int subjectId,Student student) {
		
		int major = student.getMajor().getSubjectId();
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};
		ArrayList<Score> scoreList = student.getScoreList();
		
		for(Score score : scoreList) {
			
			if(score.getSubject().getSubjectId() == subjectId) {
				String grade;
				if(score.getSubject().getGradeType() == Define.PF_EVAL) {
					grade= gradeEvaluation[Define.PF_EVAL].grade(score.getPoint());
				}
				else {
					
					if(major == subjectId) {
						grade=gradeEvaluation[Define.SAB_EVAL].grade(score.getPoint());
					}
					
					else {
						grade=gradeEvaluation[Define.AB_EVAL].grade(score.getPoint());
					}
				}
				
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
			}	
		}
	}
	
	public void makeFooter() {
		buffer.append(GenerateReport.LINE);
	}
}

