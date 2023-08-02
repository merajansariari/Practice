
public class Relational {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=10;
		c=15;
		
	System.out.println(a==b && b<c && c>a);	
	System.out.println(a==b && b>c && c>a);	
	System.out.println(a==b || b>c || c>a);	
	System.out.println(a>b || b>c || c<a);	
	System.out.println(a==b && b>c || c>a);	
	System.out.println(a==b || b<c && c>a);	
	System.out.println(!true);	
	}

}
