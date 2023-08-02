import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		
		int age = sc.nextInt();
		System.out.println("Age is "  +  age);
		
		System.out.println("Enter the CGPA");
		double n = sc.nextDouble();
		System.out.println("CGPA is " + n);
		
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Name is " + name);

	}

}
