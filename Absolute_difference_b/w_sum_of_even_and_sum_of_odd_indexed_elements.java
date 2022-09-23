import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,even=0,odd=0,absolute;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            even=even+x[i];
        }
        for(i=0;i<n;i++)
        {
            if(i%2==1)
            odd=odd+x[i];
        }
        absolute=odd-even;
        if(absolute<0)
        {
        absolute=Math.abs(absolute);
        }
        System.out.println(absolute);
    }
}