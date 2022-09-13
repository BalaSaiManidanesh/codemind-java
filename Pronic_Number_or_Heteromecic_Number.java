import java.util.Scanner;
class PronicNumber
{
  public static boolean isPronic(int n)
  {
     int x=(int)Math.sqrt(n);
	 if(x*(x+1)==n)
	    return true;
	 else 
	    return false;
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  if(isPronic(n))
		System.out.println("YES");
	  else
	    System.out.println("NO");
	  sc.close();
  }
}