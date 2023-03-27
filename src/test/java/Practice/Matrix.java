package Practice;

public class Matrix {

	
	public static void main(String[] args) {
		
	int abc[][] = {{4,5,9}, {5,4,3}, {7,5,8}};
	int min = abc[0][0];
	int mincol = 0;
	
	for (int i=0; i<3; i++)
		
	{
		
		for (int j=0; j<3; j++)
			
		{
			if (abc[i][j]<min)

				
			{
				
				min = abc[i][j];
				mincol = j;
			}
		}
		
		
	}

	
		
	// printing the max number from the min coloum
	
	int max = abc[0][mincol];
	int k=0;
	while (k<3)
	{
		if (abc[k][mincol]>max)
		
		{
		 max = abc[k][mincol];
		 
	}
	
		k++;
		
	}
	System.out.println(max);
		
	}
	
	
}
