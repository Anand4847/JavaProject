package Practice;

public class MaxNumber {

	public static void main(String[] args) {
		
		
	int abc[][] = {{5,5,4}, {6,3,7}, {2,8,6}};
	int max = abc[0][0];
	
	for (int i =0; i<3; i++)
	
	{
		for (int j=0; j<3 ; j++)
		
		{
			
			if (abc[i][j]>max)
			
			{
				
				max = abc[i][j];
				
			}
		}
		
	}
	System.out.println(max);
	
		
	}
}
