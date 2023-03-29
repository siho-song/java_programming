package school;

public class Score {
	
	private int studentId;
	private int point;
	private Subject subject;
	
	public Score(int studentId, int point, Subject subject) {
		this.studentId = studentId;
		this.point = point;
		this.subject = subject;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
}
