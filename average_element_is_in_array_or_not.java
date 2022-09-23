import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0,c=0;
        double avg=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<=n-1;i++)
          x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           sum+=x[i]; 
        }
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(x[i]==avg)
                c=1;
        }
        if(c==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
          
       
    }
}