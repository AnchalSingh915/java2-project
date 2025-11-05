import java.util.*;
class sheetq3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="",str1="";
        char ch;
        int i=0;
        System.out.println("enter the string");
        str=sc.nextLine(); 
        for(i=0;i<str.length();i++)
        {
         ch=str.charAt(i);
         if(ch==' ')
         {
             System.out.println(str1);
             str1="";
         }
         else
         {
             str1=str1+ch;
         }
        }
        System.out.println(str1);
    }
}
 