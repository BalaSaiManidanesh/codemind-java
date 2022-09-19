import java.util.*;
class HappyNumber
{
    public static int happyNumber(int n)
    {
        int r=0,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r);
            n=n/10;
        }
        return sum;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int result=n;
            while(result!=1&&result!=4)
            {
                result = happyNumber(result);
            }
            if(result==1)
             System.out.println("True");
            else
             System.out.println("False");
        }
}