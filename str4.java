import java.util.*;
class str4
{
    public static void main(String args[])
    {
        String str;
        int i=0,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        str=sc.nextLine();  
        System.out.print(str.charAt(0));
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            k=k+1;
        }
        for(i=0;i<str.length();i++)
        {
          if(str.charAt(i)==' ')
          {
              j=j+1;
              if(j<=k)
              System.out.print(".");
              System.out.print(str.charAt(i+1));
          }  
        else
        for(j=i+1;j<str.length();j++)
        {  
        System.out.print(str.charAt(i+1));
         }
}

