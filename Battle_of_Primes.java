import java.util.Scanner;
class main
{
 public static boolean isprime(int n)
 {
 if(n<2)
 {
 return false;
 }
 int l;
 l=(int)Math.sqrt(n);
 for(int i=2;i<=l;i++)
 {
 if(n%i==0)
 {
 return false;
 }
 }
 return true;
 }
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int a,b,c;
 a=sc.nextInt();
 b=sc.nextInt();
 c=a+b;
 for(int i=1;i<=c;i++)
 {
 if(isprime(c+i))
 {
 System.out.println(i);
 break;
 }
 }
 }
 }