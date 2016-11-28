package as9;

public class StudentExt extends Student {
	private String gradeType;
		public StudentExt (int id,String n,int[] s, String gt){
			super(id,n,s);
			gradeType = gt;
		}
	public String findGrade(){
		String grade = super.findGrade();
		if(gradeType.equalsIgnoreCase("Credit")){
			if(grade.equalsIgnoreCase("A")||grade.equalsIgnoreCase("B")||
					grade.equalsIgnoreCase("C")){
				grade = "CR";
			}
			else {
				grade = "NCR";
			}
		}
		return grade;
	}
 public String getGradeType(){
	 return gradeType;
 }
}
