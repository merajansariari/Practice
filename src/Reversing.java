
public class Reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s1 = "MerajAnsari";
//		String s2 = "";
		
//		for(int i = s1.length()-1; i>=0; i--)
//		{
			
//			s2 = s2 + s1.charAt(i);
			
//		}
		
	//	System.out.println("Before Reversing :" + s1);
	//	System.out.println("After Reversing :" + s2);
		
		
//		String s1 = "Meraj Ansari";
//		String s2 = "";
//		String arr[] = s1.split(" ");
		
//		for(int i = arr.length-1; i>=0; i--)
//		{
			
//			s2 = s2 + arr[i] + " ";
			
//		}
		
//		System.out.println("Before Reversing :" + s1);
//		System.out.println("After Reversing :" + s2);
		
		
//		String s1 = "Meraj Ansari Mari";
//		String s2 = "";
		
		
//		for(int i = s1.length()-1; i>=0; i--)
//		{
			
	//		s2 = s2 + s1.charAt(i);
			
//		}
		
//		System.out.println("Before Reversing :" + s1);
//		System.out.println("After Reversing :" + s2);
		
		

		String s1 = "Meraj Ansari Mari";
		String s2 = "";
		String arr[] = s1.split(" ");
		
		for(String s3 : arr)
		{
			for(int i = s3.length()-1; i>=0; i--)
			{
				
				s2 = s2 + s3.charAt(i);
				
			}	
			s2 = s2+" ";
		}
		
		
		
		System.out.println("Before Reversing :" + s1);
		System.out.println("After Reversing :" + s2);
		
	}

}
