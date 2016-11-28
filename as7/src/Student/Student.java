package Student;

public class Student {
	private int id;
	private String name;
	private int[] scores;
	public Student(int id, String n , int[]s){
		this.id = id;
		name =n;
		scores = s.clone();
	}
	public String findGrade(){
		String grade = null;
		double sum=0;

	for(int i=0;i<scores.length;i++){
		sum=sum+scores[i];
	}
	double avg=sum/scores.length;
	if(avg >=90.0){
		grade = "A";
	}
	else if(avg >=80.0){
		grade = "B";
	}
	else if(avg >=70.0){
		grade = "C";
	}
	else if(avg >=60.0){
		grade = "D";
	}
	else{
		grade = "F";
	}
	return grade;
	

}
public int getId(){
	return id;
}
public String getName(){
	return name;
}
}
