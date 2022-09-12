import java.util.*;
class Separete
{
    public static int largestdigit(int n)
    {
        int max=0,r;while (n>0)
        {
            r=n%10;if(r>max)max=r;n=n/10;
            }
            return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,result=0;
        n=sc.nextInt();
        result=largestdigit(n);
        System.out.println(result);
    }
}