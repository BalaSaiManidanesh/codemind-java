import java.util.*;
class Main
{
    static void print(int n)
    {
        int r1=1,r2=1;
        for (int i=0;i<n;i++)
        {
            for (int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=r1;k++)
            {
                System.out.print(Math.abs(k-r2));
            }
             r1+=2;r2++;
             System.out.println();
          }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        print(n);
    }
}