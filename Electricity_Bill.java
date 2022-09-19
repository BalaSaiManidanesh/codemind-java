import java.util.Scanner;
class Main
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        float b;
        String customerid,name;
        customerid=sc.nextLine();
        name=sc.nextLine();
        x=sc.nextInt();
        if(x<=199)
        { 
            b=x*1.20f; 
            
        } 
        else if(x>=200 && x<400)
        {
            b=x*1.50f; 
            
        }
        else if(x>=400 && x<600)
        { 
            b=x*1.80f; 
        } 
        else 
         b=x*2.00f;
        if(b>400) 
        {
            b=b*0.15f+b;
        }
            else 
            b=b+100;
            System.out.format("%.2f",b); 
    }
}