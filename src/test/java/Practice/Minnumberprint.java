package Practice;

public class Minnumberprint {

	public static void main(String[] args) {

		int abc[][] = { { 4, 5, 9 }, { 1, 3, 0 }, { 6, 2, 8 } };
		int min = abc[0][0];
       
		for (int i = 0; i < 3; i++)

		{

			for (int j = 0; j < 3; j++)

			{
				

				if (abc[i][j] < min) {

					min = abc[i][j];

				}

			}
		}
		System.out.println(min);

	}

}
