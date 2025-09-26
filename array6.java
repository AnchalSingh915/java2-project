import java.util.*;
class array6
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,ma=0,mi=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the no.");
            a[i]=sc.nextInt();
        }
        ma=a[0];
        mi=a[0];
        for(i=0;i<10;i++)
        {
          if(ma<a[i])
          ma=a[i];
          if(mi>a[i])
          mi=a[i];
        }
        System.out.print("maximum is:"+ma+"minimum is:"+mi);
    }
}


