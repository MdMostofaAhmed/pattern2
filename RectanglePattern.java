import java.util.Scanner;

public class RectanglePattern {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Integer num for display star pattern ");
		int n=scan.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			
				//System.out.print("");
			//}
		//	for (int k=1; k<=i; k++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
