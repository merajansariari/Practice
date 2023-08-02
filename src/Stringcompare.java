
public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String r1 = "meraj";
		String r2 = "meraj";
		String r3 = "Meraj";
		
	    String r4 = new String("meraj");
	    String r5 = new String("meraj");
	    String r6 = new String("Meraj");
	    
	    System.out.println(r1==r2); //true
	    System.out.println(r2==r3); //false
	    System.out.println(r1==r3); //false
	    System.out.println(r1==r6); //false
	    System.out.println(r1==r5); //false
	    System.out.println(r5==r6); //false
	    System.out.println(r4==r5); //false                      
	    System.out.println(r3.equals(r6)); //true
	    System.out.println(r1.equalsIgnoreCase(r3)); //false  
	    System.out.println(r1.equals(r2)); //true 
	    System.out.println(r1.equals(r4)); //true 
	    System.out.println(r4.equals(r5)); //true 
	    System.out.println(r5.equals(r3));  //false
	    System.out.println(r6.equals(r2));  //false
	}

}
