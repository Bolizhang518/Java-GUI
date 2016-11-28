package as10;


public class Day {
	
	private int day;
	protected int month;
	
	public Day(int d,int m){
	 this.day = d;
	 this.month = m;
	
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	public int findDayNum ( )
	  {
        
        int dayNum=0;
        
        for(int i=1; i<month;i++){
           if(i==4 || i == 6 || i == 9 || i == 11)
             dayNum = dayNum + 30;
           else if (i==2)
             dayNum = dayNum + 28;
           else
             dayNum = dayNum + 31;
        }
        dayNum = dayNum + day;
        return dayNum;
 
	  }
}
