import java.util.*;
class  array11
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
          for(j=i+1;j<10;j++)
          {
            if(a[i]>a[j])
            {
             k=a[i];
             a[i]=a[j];
             a[j]=k;
            }
          }
        }
        System.out.println("output is");
        for(i=0;i<10;i++)
        System.out.print(" "+a[i]);
    }
}    
  
