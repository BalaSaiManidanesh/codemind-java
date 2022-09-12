import java.util.*;
class Main
{
public static boolean isprime(int n)
{ 
int count=0;
 for(int i=2;i<=(int)Math.sqrt(n);i++)
 {
if(n%i==0)
count++;
}
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
public static int reverse(int p)
{
    int i,sum=0,r; while(p>0) 
    {
        r=p%10; sum=sum*10+r; p=p/10; 
    } 
    return sum; 
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,i;
    n=sc.nextInt(); 
    if(!isprime(n)) 
    System.out.print("not prime" ); 
    else if
    (isprime(reverse(n))) 
    System.out.print("circular prime" ); 
    else 
    System.out.print("prime but not a circular prime" );
    } 
}