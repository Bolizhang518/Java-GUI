package as10;
public class LeapDay extends Day
{
  private int year;

  public LeapDay (int d, int m, int y )
  {
    super (d,m);
    month = m;
    year = y;

  }

  public int findDayNum ( )
  {
    int dayNum;
    dayNum = super.findDayNum ( );
    boolean leap=false;
    if (   ((year % 400) == 0) ||
         ( ((year %   4) == 0) && ((year%100) != 0) )  )
         leap = true;

     if ( leap && month > 2)
      dayNum = dayNum + 1;
    return dayNum;
  }
public int findYear() {
	// TODO Auto-generated method stub
	
	return year;
}
}