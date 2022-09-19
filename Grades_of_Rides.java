import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n1,n2,n3;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if
        (n1>50 && n2>60 && n3>100)
         System.out.println("10");
        else if(n1>50 && n2>60)
         System.out.println("9");
        else if(n2>60 && n3>100) 
         System.out.println("8");
        else if(n1>50 && n3>100)
         System.out.println("7");
         else if(n1>50 || n2>60 ||n3>100)
          System.out.println("6");
         else
         System.out.println("5"); 
    }
}