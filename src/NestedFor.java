//Nested for loop
/* print the below output 
 * ****
 * ****
 * ****
 * ****
 */

public class NestedFor 
{
   public static void main(String args[]) 
   {
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 4; j++) //nested loop
			{
				System.out.print("*");
			}
			System.out.println();
	  }
   }
}
