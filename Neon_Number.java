import java.util.Scanner;
class NeonNumber
{
  public static String isNeonNumber(int x)
  {
      int temp=x,sum=0;
	  x=x*x;
	  while(x>0)
	  {
	     sum=sum + x%10;
		 x=x/10;
	  }
	  if(sum==temp)
		return "Neon Number";
	  else
		return "Not Neon Number";
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.print(isNeonNumber(n));
	  sc.close();
  }
}