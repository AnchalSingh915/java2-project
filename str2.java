import java.util.*;
class str2
{
    public static void main(String args[])
    {
        String str;
        int v=0,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        str=sc.nextLine();  
        for(v=0;v<str.length();v++)
        {
          for(t=0;t<=v;t++)
          System.out.print(str.charAt(t));
          System.out.println();
        }
    }     
}

             
