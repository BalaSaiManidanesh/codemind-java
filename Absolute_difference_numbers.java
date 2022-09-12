import java.util.Scanner;
class Difference
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,d,len,d1,d2; 
        n=sc.nextInt(); 
        d=sc.nextInt(); 
        len=(int)Math.log10(n)+1; 
        d2=n%(int)Math.pow(10,d); 
        d1=n/(int)Math.pow(10,len-d); 
        System.out.println(Math.abs(d1-d2)); 
        sc.close(); 
        }
}