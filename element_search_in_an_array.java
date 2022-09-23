import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],k,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<=n-1;i++)
          x[i]=sc.nextInt();
          
         k=sc.nextInt();
        for(int i=0;i<=n-1;i++)
         {
             if(x[i]==k)
               {
                   c=1;
               }
             
         }
         if(c==0)
           System.out.println("False");
         else
           System.out.println("True");
    }
}