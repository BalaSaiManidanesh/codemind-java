import java.util.Scanner;
class Main
{
    public static void main(String arrgs[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float area;
        r=sc.nextInt();
        area=3.14f*r*r;
        System.out.format("%.2f",area);
    }
}