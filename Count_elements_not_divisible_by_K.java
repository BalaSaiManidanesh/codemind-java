import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,k,count=0;
        n=sc.nextInt();
        
         x=new int[n];
        k=sc.nextInt();
         for(int i=0;i<n;i++)
           x[i]=sc.nextInt();
         
         for(int i=0;i<n;i++)
         {
             if(x[i]%k!=0)
               count++;
         }
        System.out.println(count);         
    }
}