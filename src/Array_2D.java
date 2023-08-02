
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int a[][] = {
		   
		   {2,5,7,8,},
		   {6,4,5,2},
		   {7,8,9,10,}
		   
              };	
      
      for(int i=0; i<=2; i++)
      {
    	 for(int j=0; j<=3; j++)
    	 {
    		 System.out.print(a[i][j] + " ");
    	 }
    	 System.out.println();
      }
		
	String name[][] = new String [3][];
	
	name[0] = new String[5];
	name[1] = new String[4];
	name[2] = new String[3];
	
	 name[0][0] = "Meraj";
	 name[0][1] = "Indra";
	 name[0][2] = "Raj";
	 name[0][3] = "Rahul";
	 name[0][4] = "Geeta";
	 name[1][0] = "Ayaz";
	 name[1][1] = "Kuldeep";
	 name[1][2] = "Abhishek";
	 name[1][3] = "Ram";
	 name[2][0] = "Raju";
	 name[2][1] = "Ravi";
	 name[2][2] = "Neha";
	// name[2][3] = "Radha";
	 
	 
	 for(int i=0; i<=2; i++)
	 {
		for(int j=0; j<name[i].length; j++)
		{
    		System.out.print(name[i][j] + " ");
		}
		System.out.println();
	 }
	 
	}

}
