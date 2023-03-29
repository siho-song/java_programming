package evaluation;

public class MajorEvaluation implements GradeEvaluation{

	@Override
	public String grade(int point) {
		if(95<= point && point>=100) {
			return "S";
		}
		else if(90 <= point) {
			return "A";
		}
		else if(80<= point) {
			return "B";
		}
		else if(70<= point) {
			return "C";
		}
		else if(60<= point) {
			return "D";
		}
		else if(0<=point && point<60) {
			return "F";
		}
		else {
			return "(MajorEvaluation) point value error";
		}
		
	}

}
