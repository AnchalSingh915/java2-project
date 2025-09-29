import java.util.*;
class  array9
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
        for(i=0;i<9;i++)
        {
          for(j=0;j<9-i;j++)
          {
            if(a[j]>a[j+1])
            {
             k=a[j];
             a[j]=a[j+1];
             a[j+1]=k;
            }
          }
        }
        System.out.println("output is");
        for(i=0;i<10;i++)
        System.out.print(" "+a[i]);
    }
}    
  
