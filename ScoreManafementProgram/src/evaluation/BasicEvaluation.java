package evaluation;

public class BasicEvaluation implements GradeEvaluation{

	public String grade(int point) {
		if(90 <= point && point >=100) {
			return "A";
		}
		else if(80<= point) {
			return "B";
		}
		else if(70<= point) {
			return "C";
		}
		else if(55<= point) {
			return "D";
		}
		else if(0<=point && point<55) {
			return "F";
		}
		else {
			return "(BasicEvaluation) point value error";
		}
	}


}
