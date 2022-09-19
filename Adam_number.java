import java.util.Scanner;
class AdamNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int semp=n*n;
        int r,sum=0,add=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        int d=sum*sum;
        while(d>0)
        {
            r=d%10;
            add=add*10+r;
            d=d/10;
        }
        if(semp==add)
         System.out.println("True");
        else
         System.out.println("False");
         }
}