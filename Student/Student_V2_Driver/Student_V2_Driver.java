public class Student_V2_Driver {
	public static void main(String[] args) {
		Student_V2 Student01 = new Student_V2("Donald Trum", 917756800);
		
		System.out.println("STUDENT01 INFO:");

		Student01.setStudentName("Donald Trump");
		Student01.setStudentAbsences(4);

		System.out.println("Student01's name: " + Student01.getStudentName());
		System.out.println("Student01's # of absences: " + Student01.getStudentAbsences());
		System.out.println("Student01's student number: " + Student01.getStudentNumber());
		
		for (int periodNumber = 1; periodNumber <= 2; periodNumber++) {
			Student01.setClassName(periodNumber, "STILL UNENROLLED");

			for (int quarterNumber = 1; quarterNumber <= 4; quarterNumber++) {
				Student01.setQuarterGrade(periodNumber, quarterNumber, (int)(100 - (Math.random() * 100)));

				System.out.println("Student01's period " + periodNumber + " quarter " + quarterNumber + " GPA: " + Student01.getQuarterGPA(periodNumber, quarterNumber));
				System.out.println("Student01's period " + periodNumber + " quarter " + quarterNumber + " letter grade: " + Student01.getQuarterLetterGrade(periodNumber, quarterNumber));
				System.out.println("Student01's period " + periodNumber + " quarter " + quarterNumber + " number grade: " + Student01.getQuarterNumberGrade(periodNumber, quarterNumber));
			}
		}

		System.out.println("\n\n\n");

		Student_V2 Student02 = new Student_V2("Barack Obam", 773659687, "Computer Science", "Human Geography", "British Literature", "Seminar", "Calculus", "Environmental Science", "Macroeconomics");
		
		System.out.println("STUDENT02 INFO:");

		Student02.setStudentName("Barack Obama");
		Student02.setStudentAbsences(1);

		System.out.println("Student02's name: " + Student02.getStudentName());
		System.out.println("Student02's # of absences: " + Student02.getStudentAbsences());
		System.out.println("Student02's student number: " + Student02.getStudentNumber());
		
		for (int periodNumber = 1; periodNumber <= 7; periodNumber++) {
			for (int quarterNumber = 1; quarterNumber <= 4; quarterNumber++) {
				
				Student02.setQuarterGrade(periodNumber, quarterNumber, (int)(100 - (Math.random() * 100)));

				System.out.println("Student02's period " + periodNumber + " quarter " + quarterNumber + " GPA: " + Student02.getQuarterGPA(periodNumber, quarterNumber));
				System.out.println("Student02's period " + periodNumber + " quarter " + quarterNumber + " letter grade: " + Student02.getQuarterLetterGrade(periodNumber, quarterNumber));
				System.out.println("Student02's period " + periodNumber + " quarter " + quarterNumber + " number grade: " + Student02.getQuarterNumberGrade(periodNumber, quarterNumber));
			}
		}	
	}
}