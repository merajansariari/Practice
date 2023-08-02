
public class Incrementation {

	public static void main(String[] args) {
		
	// int a=4;
	 //a++;
	 //System.out.println(a);
	 //a--;
	 //System.out.println(a);
		//Post Increment
     int a,b,e;
     a = 5;
     b = a++;
    
     System.out.println(b);
     //Pre Increment
     int c,d;
     c = 8;
     d = ++c;
     e = a++ + ++a + --a;
     System.out.println(c);
     System.out.println(d);
     System.out.println(e);
     System.out.println(a);
	}

}
