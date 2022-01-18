import java.util.Arrays;
public class Student_V2 {
	private String STUDENT_NAME;
	private int STUDENT_NUMBER = -1;
	
	private int studentAbsences = 0;
	
	private String[] enrolledClasses = new String[7];
	private StudentClass[] classObjectInformation = new StudentClass[7];
	
	public Student_V2(String studentName, int studentNumber) {
		STUDENT_NAME = studentName;
		STUDENT_NUMBER = studentNumber;
	}
	
	public Student_V2(String studentName, int studentNumber, String givenClass1Name, String givenClass2Name, String givenClass3Name, String givenClass4Name, String givenClass5Name, String givenClass6Name, String givenClass7Name) {
		STUDENT_NAME = studentName;
		STUDENT_NUMBER = studentNumber;
		
		StudentClass Class1 = new StudentClass(givenClass1Name);
		StudentClass Class2 = new StudentClass(givenClass2Name);
		StudentClass Class3 = new StudentClass(givenClass3Name);
		StudentClass Class4 = new StudentClass(givenClass4Name);
		StudentClass Class5 = new StudentClass(givenClass5Name);
		StudentClass Class6 = new StudentClass(givenClass6Name);
		StudentClass Class7 = new StudentClass(givenClass7Name);
		
		classObjectInformation[0] = Class1;
		classObjectInformation[1] = Class2;
		classObjectInformation[2] = Class3;
		classObjectInformation[3] = Class4;
		classObjectInformation[4] = Class5;
		classObjectInformation[5] = Class6;
		classObjectInformation[6] = Class7;
	}		
	
	public String toString() {
		String str = "Hello! My name is " + STUDENT_NAME + " and I am currently a student. My student number is " + STUDENT_NUMBER + " and I am currently enrolled in the following classes: ";
		
		System.out.println(Arrays.toString(enrolledClasses));
		return str;
	}
	
	public int getStudentAbsences() {
		return studentAbsences;
	}

	public void setStudentAbsences(int absenceNumber) {
		studentAbsences = absenceNumber;
	}

	public int getStudentNumber() {
		return STUDENT_NUMBER;
	}

	public String getStudentName() {
		return STUDENT_NAME;
	}

	public void setStudentName(String studentName) {
		STUDENT_NAME = studentName;
	}
	
	public double getSemesterGPA(int semesterNumber) {
		int addedNumber = 0;
		for (int i = 0; i < classObjectInformation.length; i++) {
			addedNumber = addedNumber + classObjectInformation[i].getSemesterGrade(semesterNumber);
		}
		
		return (addedNumber / 7);
	}
	
	public int getQuarterNumberGrade(int periodNumber, int quarterNumber) {
		return classObjectInformation[periodNumber - 1].getQuarterNumberGrade(quarterNumber);
	}
	
	public String getQuarterLetterGrade(int periodNumber, int quarterNumber) {
		return classObjectInformation[periodNumber - 1].getQuarterLetterGrade(quarterNumber);
	}
	
	public int getQuarterGPA(int periodNumber, int quarterNumber) {
		return classObjectInformation[periodNumber - 1].getQuarterGPA(quarterNumber);
	}
	
	public int getSemesterGrade(int periodNumber, int semesterNumber) {
		return classObjectInformation[periodNumber - 1].getSemesterGrade(semesterNumber);
	}
	
	public void setQuarterGrade(int periodNumber, int quarterNumber, int quarterGrade) {
		classObjectInformation[periodNumber - 1].setQuarterGrade(quarterNumber, quarterGrade);
	}
	
	public void setFinalSemesterExamGrade(int periodNumber, int semesterNumber, int examGrade) {
		classObjectInformation[periodNumber - 1].setFinalSemesterExamGrade(semesterNumber, examGrade);
	}
} 