class PenDistribution {
	public static void main(String[] args) {
	int totalPens =14;
	int student = 3;
	
	int pensPerStudent = totalPens/student;
	int remainingPens = totalPens % student;
	
	System.out.println(
	"the pen per student is "+pensPerStudent+"and the remaining pen not distributed is "+remainingPens);
	}
	}