
class calc{
	public int add(int r[])
	{
		int d = 0;
		for(int s : r )
		{
			 d = d + s;
		}
		return d;
		
	}
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	calc a = new calc();	
	int d = a.add(new int []{5,6,8,6,7});
	System.out.println(d);
		
	}

}
