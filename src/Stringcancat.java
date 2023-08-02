
public class Stringcancat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1 = "Meraj";
		String a2 = "Meraj";
		  a2 = a2.concat("Ansari");
		 String r1 = a2.concat("Mari"); 
		String a3 = new String("Meraj");
		String a4 = new String("Meraj");
		  a4 = a4.concat("Ansari");
		  
		  System.out.println(a1);
		  System.out.println(a2);
		  System.out.println(r1);
		  System.out.println(a3);
		  System.out.println(a4);
		  
		  String b1 = "Meraj";
		  String b2 = "Meraj" + " Ansari";
		  String b3 = b1 + b2;
		  String b4 = "Meraj" + " 17" + " 08" + " 26";
		  String b5 = b1 + b2 + b3 + b4;
		  
		  System.out.println(b1);
		  System.out.println(b2);
		  System.out.println(b3);
		  System.out.println(b4);
		  System.out.println(b5);
		  
	}

}
