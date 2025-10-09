import java.util.*;
class arrs4
{
    public static void main(String args[])
    {
        String str[]=new String[5];
        String str1="",str2="";
        int i=0,v=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("enter the string");
            str[i]=sc.nextLine();
        }
        for(i=0;i<5;i++)
        {
            str1=str[i];
            str2="";
            for(v=0;v<str1.length();v++)
            str2=str1.charAt(v)+str2;
            System.out.println("output is"+str2);
        }
    }
}  
 
