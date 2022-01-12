public class Student_V1 {
	private String STUDENT_NAME;
	private double DEFAULT_GRADE = -1.0;
	private String DEFAULT_PERIOD_NAME = "UNENROLLED";
	
	private int studentAbsences;
	
	private String period1Name = DEFAULT_PERIOD_NAME;
	private String period2Name = DEFAULT_PERIOD_NAME;
	private String period3Name = DEFAULT_PERIOD_NAME;
	private String period4Name = DEFAULT_PERIOD_NAME;
	private String period5Name = DEFAULT_PERIOD_NAME;
	private String period6Name = DEFAULT_PERIOD_NAME;
	private String period7Name = DEFAULT_PERIOD_NAME;
	
	private double period1Quarter1Grade = DEFAULT_GRADE;
	private double period1Quarter2Grade = DEFAULT_GRADE;
	private double period1Quarter3Grade = DEFAULT_GRADE;
	private double period1Quarter4Grade = DEFAULT_GRADE;
	
	private double period2Quarter1Grade = DEFAULT_GRADE;
	private double period2Quarter2Grade = DEFAULT_GRADE;
	private double period2Quarter3Grade = DEFAULT_GRADE;
	private double period2Quarter4Grade = DEFAULT_GRADE;
	
	private double period3Quarter1Grade = DEFAULT_GRADE;
	private double period3Quarter2Grade = DEFAULT_GRADE;
	private double period3Quarter3Grade = DEFAULT_GRADE;
	private double period3Quarter4Grade = DEFAULT_GRADE;
	
	private double period4Quarter1Grade = DEFAULT_GRADE;
	private double period4Quarter2Grade = DEFAULT_GRADE;
	private double period4Quarter3Grade = DEFAULT_GRADE;
	private double period4Quarter4Grade = DEFAULT_GRADE;
	
	private double period5Quarter1Grade = DEFAULT_GRADE;
	private double period5Quarter2Grade = DEFAULT_GRADE;
	private double period5Quarter3Grade = DEFAULT_GRADE;
	private double period5Quarter4Grade = DEFAULT_GRADE;
	
	private double period6Quarter1Grade = DEFAULT_GRADE;
	private double period6Quarter2Grade = DEFAULT_GRADE;
	private double period6Quarter3Grade = DEFAULT_GRADE;
	private double period6Quarter4Grade = DEFAULT_GRADE;
	
	private double period7Quarter1Grade = DEFAULT_GRADE;
	private double period7Quarter2Grade = DEFAULT_GRADE;
	private double period7Quarter3Grade = DEFAULT_GRADE;
	private double period7Quarter4Grade = DEFAULT_GRADE;
	
	public int getStudentAbsences()
	
	public String getLetterGrade(double numberGrade) {
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
	
	public double convertGradeToScale(String letterGrade) {
		double scaledGrade = 0;
		
		if (letterGrade == "A") {
			scaledGrade = 4.0;
			return scaledGrade;
		}
		else if (letterGrade == "B") {
			scaledGrade = 3.0;
			return scaledGrade;
		}
		else if (letterGrade == "C") {
			scaledGrade = 2.0;
			return scaledGrade;
		}
		else if(letterGrade == "D") {
			scaledGrade = 1.0;
			return scaledGrade;
		}
		
		return scaledGrade;
	}
	
	public double getQuarterGrade(int quarterNumber, int periodNumber) {
		if (periodNumber == 1) {
			if (quarterNumber == 1) {
				return period1Quarter1Grade;
			}
			else if (quarterNumber == 2) {
				return period1Quarter2Grade;
			}
			else if (quarterNumber == 3) {
				return period1Quarter3Grade;
			}
			else if (quarterNumber == 4) {
				return period1Quarter4Grade;
			}
		}
		else if (periodNumber == 2) {
			if (quarterNumber == 1) {
				return period2Quarter1Grade;
			}
			else if (quarterNumber == 2) {
				return period2Quarter2Grade;
			}
			else if (quarterNumber == 3) {
				return period2Quarter3Grade;
			}
			else if (quarterNumber == 4) {
				return period2Quarter4Grade;
			}
		}
		else if (periodNumber == 3) {
			if (quarterNumber == 1) {
				return period3Quarter1Grade;
			}
			else if (quarterNumber == 2) {
				return period3Quarter2Grade;
			}
			else if (quarterNumber == 3) {
				return period3Quarter3Grade;
			}
			else if (quarterNumber == 4) {
				return period3Quarter4Grade;
			}
		}
		else if (periodNumber == 4) {
			if (quarterNumber == 1) {
				return period4Quarter1Grade;
			}
			else if (quarterNumber == 2) {
				return period4Quarter2Grade;
			}
			else if (quarterNumber == 3) {
				return period4Quarter3Grade;
			}
			else if (quarterNumber == 4) {
				return period4Quarter4Grade;
			}
		}
		else if (periodNumber == 5) {
			if (quarterNumber == 1) {
				return period5Quarter1Grade;
			}
			else if (quarterNumber == 2) {
				return period5Quarter2Grade;
			}
			else if (quarterNumber == 3) {
				return period5Quarter3Grade;
			}
			else if (quarterNumber == 4) {
				return period5Quarter4Grade;
			}
		}
		else if (periodNumber == 6) {
			if (quarterNumber == 1) {
				return period6Quarter1Grade;
			}
			else if (quarterNumber == 2) {
				return period6Quarter2Grade;
			}
			else if (quarterNumber == 3) {
				return period6Quarter3Grade;
			}
			else if (quarterNumber == 4) {
				return period6Quarter4Grade;
			}
		}
		else if (periodNumber == 7) {
			if (quarterNumber == 1) {
				return period7Quarter1Grade;
			}
			else if (quarterNumber == 2) {
				return period7Quarter2Grade;
			}
			else if (quarterNumber == 3) {
				return period7Quarter3Grade;
			}
			else if (quarterNumber == 4) {
				return period7Quarter4Grade;
			}
		}
		
		return DEFAULT_GRADE;
	}
	
	public void setQuarterGrade(int quarterNumber, int periodNumber, double numberGrade) {
		if (numberGrade < 0) {
			numberGrade = -1;
		}
		
		if (periodNumber == 1) {
			if (quarterNumber == 1) {
				period1Quarter1Grade = numberGrade;
			}
			else if (quarterNumber == 2) {
				period1Quarter2Grade = numberGrade;
			}
			else if (quarterNumber == 3) {
				period1Quarter3Grade = numberGrade;
			}
			else if (quarterNumber == 4) {
				period1Quarter4Grade = numberGrade;
			}
		}
		else if (periodNumber == 2) {
			if (quarterNumber == 1) {
				period2Quarter1Grade = numberGrade;
			}
			else if (quarterNumber == 2) {
				period2Quarter2Grade = numberGrade;
			}
			else if (quarterNumber == 3) {
				period2Quarter3Grade = numberGrade;
			}
			else if (quarterNumber == 4) {
				period2Quarter4Grade = numberGrade;
			}
		}
		else if (periodNumber == 3) {
			if (quarterNumber == 1) {
				period3Quarter1Grade = numberGrade;
			}
			else if (quarterNumber == 2) {
				period3Quarter2Grade = numberGrade;
			}
			else if (quarterNumber == 3) {
				period3Quarter3Grade = numberGrade;
			}
			else if (quarterNumber == 4) {
				period3Quarter4Grade = numberGrade;
			}
		}
		else if (periodNumber == 4) {
			if (quarterNumber == 1) {
				period4Quarter1Grade = numberGrade;
			}
			else if (quarterNumber == 2) {
				period4Quarter2Grade = numberGrade;
			}
			else if (quarterNumber == 3) {
				period4Quarter3Grade = numberGrade;
			}
			else if (quarterNumber == 4) {
				period4Quarter4Grade = numberGrade;
			}
		}
		else if (periodNumber == 5) {
			if (quarterNumber == 1) {
				period5Quarter1Grade = numberGrade;
			}
			else if (quarterNumber == 2) {
				period5Quarter2Grade = numberGrade;
			}
			else if (quarterNumber == 3) {
				period5Quarter3Grade = numberGrade;
			}
			else if (quarterNumber == 4) {
				period5Quarter4Grade = numberGrade;
			}
		}
		else if (periodNumber == 6) {
			if (quarterNumber == 1) {
				period6Quarter1Grade = numberGrade;
			}
			else if (quarterNumber == 2) {
				period6Quarter2Grade = numberGrade;
			}
			else if (quarterNumber == 3) {
				period6Quarter3Grade = numberGrade;
			}
			else if (quarterNumber == 4) {
				period6Quarter4Grade = numberGrade;
			}
		}
		else if (periodNumber == 7) {
			if (quarterNumber == 1) {
				period7Quarter1Grade = numberGrade;
			}
			else if (quarterNumber == 2) {
				period7Quarter2Grade = numberGrade;
			}
			else if (quarterNumber == 3) {
				period7Quarter3Grade = numberGrade;
			}
			else if (quarterNumber == 4) {
				period7Quarter4Grade = numberGrade;
			}
		}
	}
	
	public String getPeriodName(int periodNumber) {
		if (periodNumber == 1) {
			return period1Name;
		}
		else if (periodNumber == 2) {
			return period2Name;
		}
		else if (periodNumber == 3) {
			return period3Name;
		}
		else if (periodNumber == 4) {
			return period4Name;
		}
		else if (periodNumber == 5) {
			return period5Name;
		}
		else if (periodNumber == 6) {
			return period6Name;
		}
		else if (periodNumber == 7) {
			return period7Name;
		}
		
		return "";
	}
	
	public void setPeriodName(int periodNumber, String periodName) {
		if (periodNumber == 1) {
			period1Name = periodName;
		}
		else if (periodNumber == 2) {
			period2Name = periodName;
		}
		else if (periodNumber == 3) {
			period3Name = periodName;
		}
		else if (periodNumber == 4) {
			period4Name = periodName;
		}
		else if (periodNumber == 5) {
			period5Name = periodName;
		}
		else if (periodNumber == 6) {
			period6Name = periodName;
		}
		else if (periodNumber == 7) {
			period7Name = periodName;
		}
	}
	
	
} 