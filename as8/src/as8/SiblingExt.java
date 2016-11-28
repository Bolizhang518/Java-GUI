package as8;

public class SiblingExt extends Sibling{
	private int height;
	
	public int getHeight() {
		return height;
	}

	public SiblingExt (String n,int a, int w,int h){
		super (n,a,w);
		height = h;
		
	}
}
