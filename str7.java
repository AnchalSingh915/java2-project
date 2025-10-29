 import java.util.*;
class str7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=" ";
        char ch;
        int i=0,a=0,c=0;
        System.out.println("enter the string");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        { ch=str.charAt(i);
            if(ch==' ')
            a=a+1;
        }
        c=a+1;
        System.out.println("no. of words"+c);
    }
}
        
            
