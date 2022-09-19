import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n1,n2,sum1=0,sum2=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=1;i<=n1/2;i++)
        {
            if(n1%i==0)
            {
                sum1=sum1+i;
            }
        }
        for(int i=1;i<=n2/2;i++)
        {
            if(n2%i==0)
            {
                sum2=sum2+i;
            }
        }
        if(sum1==n2 && sum2==n1)
         System.out.println("Amicable");
        else
         System.out.println("Not Amicable");
    }
}