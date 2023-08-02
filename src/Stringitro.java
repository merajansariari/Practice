
public class Stringitro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String paper = "Meraj";
	//	String p2 = "Meraj";
	//	System.out.println(p1==p2); //in heap aera in scp do not creat duplicate
		paper.concat("Ansari");
		System.out.println(paper);
		
		StringBuilder paper1 = new StringBuilder("Meraj"); // make mutable String
		System.out.println(paper1);
		paper1.append(" Ansari");
		System.out.println(paper1);
		
	//	String p3 = new String("Meraj");
	//	String p4 = new String("Meraj");
	//	System.out.println(p3==p4); //in heap aera  creat duplicate
	
	}

}
