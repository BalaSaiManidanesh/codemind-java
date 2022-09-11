import java.util.Scanner;
class Main
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int r;
		r=sc.nextInt();
		for(int i=1;i<=2*r/2;i++)			 
		{  
		    int k=i>r?r-i%r:i;
			for(int j=1;j<=r;j++)	 
			{
				if(j<=r-k)
					System.out.print(" ");
			}
			for(int p=1;p<=2*k-1;p++)
				System.out.print(i);
			
			System.out.println();
		}
	}
}
