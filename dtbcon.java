 import java.util.*;
class dtbcon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d[]=new int[10];
        int a,b=0,c;
        System.out.println("enter the no.");
        a=sc.nextInt();
        for(;a>0;)
        {
            c=a%2;
            d[b++]=c;
            a=a/2;
        }
        b--;
        for(;b>=0;b--)
        System.out.print(d[b]);
    }
}
            
