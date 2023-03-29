package evaluation;

public class PassFailEvaluation implements GradeEvaluation{

	@Override
	public String grade(int point) {
		if(point >= 70) {
			return "P";
		}
		else {
			return "F";
		}
	}

}
