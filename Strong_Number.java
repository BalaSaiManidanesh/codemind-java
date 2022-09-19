import java.util.*;
class StrongNumber
{
    public static boolean isStrong(int n)
    {
        int r,temp=n,prod,sum=0;
        while(n>0)
        { 
            r=n%10;
            prod=1; 
        for(int i=1;i<=r;i++)
        {
            prod=prod*i;
        }
         sum=sum+prod;
         n=n/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
        } 
         public static void main(String args[])
         {
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             if(isStrong(n))
              System.out.println("The number "+n+" is a strong number");
              else
              System.out.println("The number "+n+" is not a strong number");
        }
}