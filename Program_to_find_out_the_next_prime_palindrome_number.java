import java.util.*;
class Main
{
public static boolean isprime(int n)
{
 int count=0;
 for(int i=2;i<=(int)Math.sqrt(n);i++)
 {
if(n%i==0)
count++;}
if(count==0)
return true;
else
return false;
}
public static boolean ispalindrome(int n)
{
int temp=n;
int sum=0,r;
while(n>0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(temp==sum)
return true;
else
return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
for(i=n+1;;i++)
{
 if(isprime(i) && ispalindrome(i))
 {
 System.out.println(i);
 break;
 }
}
 }
}