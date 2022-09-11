import java.util.Scanner;
class Main
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int r;
		r=sc.nextInt();
		if(r>=3 && r<=100)
		{
		  for(int i=1;i<=2*r-1;i++)			 
		  {    
		    int k=i>r?r-i%r:i;
			for(int j=1;j<=k;j++)		
			{
				System.out.print("*");	
			}
			System.out.println();
		  }
		}
		else
		 System.out.println("The pattern is not possible");
	}
}
