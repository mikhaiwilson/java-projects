import java.util.Arrays;
public class StudentClass {
	String studentClassName;
	int classInfo[] = new int[12];
	
	// constants
	int QUARTER_INDEX[] = {0, 0, 2, 5, 7};
	int GPA_INDEX[] = {0, 1, 3, 6, 8};
	int SEMESTER_FIRST_QUARTER_INDEX[] = {0, 1, 6};
	int SEMESTER_SECOND_QUARTER_INDEX[] = {0, 3, 8};
	int SEMESTER_EXAM_INDEX[] = {0, 4, 9};
	int FINAL_SEMESTER_GRADE[] = {0, 12, 13};
	
	public StudentClass(String className) {
		studentClassName = className;
		Arrays.fill(classInfo, -1);
	}
	
	private int convertNumberGradeToGPA(int numberGrade) {
		int scaledGrade = 0;
		
		if (numberGrade <= 100){
			scaledGrade = 4;
			return scaledGrade;
		}
		else if (numberGrade < 90){
			scaledGrade = 3;
			return scaledGrade;
		}
		else if (numberGrade < 80){
			scaledGrade = 2;
			return scaledGrade;
		}
		else if (numberGrade >= 70){
			scaledGrade = 1;
			return scaledGrade;
		}

		return scaledGrade;
	}
	
	private String convertNumberGradeToLetterGrade(int numberGrade) {
		String letterGrade = "NG";
		
		if (numberGrade >= 90){
			letterGrade = "A";
			return letterGrade;
		}
		else if (numberGrade >= 80){
			letterGrade = "B";
			return letterGrade;
		}
		else if (numberGrade >= 70){
			letterGrade = "C";
			return letterGrade;
		}
		else if (numberGrade >= 60){
			letterGrade = "D";
			return letterGrade;
		}
		else if (numberGrade >= 0){
			letterGrade = "F";
			return letterGrade;
		}
		
		return letterGrade;
	}
	 
	/* 
 	0 quarter 1 number grade
	1 quarter 1 gpa
	2 quarter 2 number grade
	3 quarter 2 gpa
	4 semester 1 exam
	
	5 quarter 3 number grade
	6 quarter 3 gpa
	7 quarter 4 number grade
	8 quarter 4 gpa
	9 semester 2 exam
	
	10 semester 1 grade
	11 semester 2 grade
	*/
	
	// getters 
	public String getClassName() {
		return studentClassName;
	} 
	
	public int getQuarterNumberGrade(int quarterNumber) {
		return classInfo[QUARTER_INDEX[quarterNumber]];
	}
	
	public String getQuarterLetterGrade(int quarterNumber) {
		int quarterNumberGrade = getQuarterNumberGrade(quarterNumber);
		String quarterLetterGrade = convertNumberGradeToLetterGrade(quarterNumberGrade);
		
		return quarterLetterGrade;
	}
	
	public int getQuarterGPA(int quarterNumber) {
		return classInfo[GPA_INDEX[quarterNumber]];
	}
	 
	public int getSemesterGrade(int semesterNumber) {
		return classInfo[FINAL_SEMESTER_GRADE[semesterNumber]];
	}
	
	// setters
	public void setClassName(String newClassName) {
		studentClassName = newClassName;
	}
	
	public void setQuarterGrade(int quarterNumber, int quarterGrade) {
		classInfo[QUARTER_INDEX[quarterNumber]] = quarterGrade;
		classInfo[GPA_INDEX[quarterNumber]] = convertNumberGradeToGPA(quarterGrade); // automatically sets quarter gpa
	}
	
	public void setFinalSemesterExamGrade(int semesterNumber, int examGrade) {
		classInfo[SEMESTER_EXAM_INDEX[semesterNumber]] = examGrade;
		classInfo[FINAL_SEMESTER_GRADE[semesterNumber]] = (int) ((SEMESTER_FIRST_QUARTER_INDEX[semesterNumber] * 0.4) + (SEMESTER_SECOND_QUARTER_INDEX[semesterNumber] * 0.4) + (SEMESTER_EXAM_INDEX[semesterNumber] * 0.2));  // also automatically sets semester grade
	}  
	
 }