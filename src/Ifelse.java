
public class Ifelse {

	public static void main(String[] args) {
	   
		//int age = 15;
		
		//if(age>=18) {
			
	//   System.out.println("You are Iligible for vote.");		
			
		//}
		//else{
			
		//System.out.println("You are not Iligible for vote.");
		
	//	}
		int age = 81;
		
		if(age>=80) {
			System.out.println("You are very old Person.");
		}
		else if(age<80 && age>=50) {
			
		System.out.println("You are old Person.");
			
		}
		else if(age<50 && age>=20) {
			
		System.out.println("You are adult Person.");	
			
		}
		else if(age<20 && age>=10 ) {
			
		System.out.println("Your teenager.");	
			
		}
		else {
			
		System.out.println("You are child.");	
		}
	}

}
