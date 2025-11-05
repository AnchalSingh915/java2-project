import java.util.*;
class sheetq5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="",str1="",mstring="";
        char ch;
        int i=0,t=0,l=0,v=0;
        System.out.println("enter the string");
        str=sc.nextLine(); 
        for(i=0;i<str.length();i++)
        {
         ch=str.charAt(i);
                 if(ch==' ')
                 {
                     v=mstring.length();
                     l=str1.length();
                  if(v<l)
                     mstring=str1;
                  str1="";
                 }
                 else
                 {
                  str1=str1+ch;
                 }
        } 
        v=mstring.length();
        l=str1.length();
        if(v<l)
         mstring=str1;
        System.out.println("largest string is "+mstring);
        
    }
}