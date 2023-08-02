
public class Ternary {

	public static void main(String[] args) {
       
		int a=5, b=6, c=8;
		
	int res	= (a<b)? a : b;
	
	System.out.println(res);
String vr =	(a>b)? "A is less than B." : "B is greater than A. ";
		
    System.out.println(vr);
    
  int fs =  (a>b)? (a>c? a : b) :(b<c? c : b);
  
   System.out.println(fs);
	}

}
