package Practice;

public class MulidimenArray {

public static void main(String[] args) {
	
//int a[][] = new int [2][3];
//
//a[0][0] = 5;
//a[0][1] = 9;
//a[0][2] = 4;
//a[1][0] = 6;
//a[1][1] = 1;
//a[1][2] = 2;
//
////
////int b[][] = {{4,6,5}, {6,6,9}, {5,7,1}};
////
////System.out.println(b[2][1]);
//
//
//for (int i=0; i<2; i++) // outer for loop is for row
//	
//{
//	
//	for (int j=0; j<3; j++) // outer for loop is for coloum
//	
//	{
//	System.out.println(a[i][j]);
//}

//		
//}	
	
	
int a[][] = new int [2][3];

a[0][0] = 5;
a[0][1] = 4;
a[0][2]= 7;
a[1][0] = 9;
a[1][1]=3;
a[1][2]=6;
	

for (int i=0; i<2; i++)

{
	
	for (int j=0; j<3;j++)
	
		
	{
		
		System.out.println(a[i][j]);
	}
}

	
	
	
	
	
	
}
	
	
}


