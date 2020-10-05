
public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grade1 = 91.14, grade2 = 85.01, grade3 = 72, grade4 = 63, grade5 = 81.14;
		double average = (grade1+grade2+grade3+grade4+grade5)/5;
		char letterGrade = ' ';

		if(average >= 90 && average <= 100) letterGrade = 'A';
		else if(average >=80 && average < 90) letterGrade = 'B';
		else if(average >= 70 && average < 80) letterGrade = 'C';
		else if(average < 70) letterGrade = 'F';
		
		switch(letterGrade) {
			case 'A':
				System.out.print("A: Fantastic job!\n");
				break;
			case 'B':
				System.out.print("B: Good!\n");
				break;
			case 'C':
				System.out.print("C: Please try more next time!\n");
				break;
			case 'F': 
				System.out.print("F: Unfortunately you failed!\n");
				break;
			default: 
				System.out.print("Invalid grade\n");
		}
	}

}
