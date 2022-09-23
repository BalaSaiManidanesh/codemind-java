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
          avg=(float)sum/n;
       
       
            System.out.format("%.2f",avg);
        
          
       
    }
}