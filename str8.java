 import java.util.*;
class str8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=" ";
        char ch;
        int i=0,v=0,c=0;
        System.out.println("enter the string");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
          ch=str.charAt(i);
          if(ch=='a'|| ch=='A'||ch=='e'|| ch=='E'||ch=='i'|| ch=='I'||ch=='o'|| ch=='O'||ch=='u'|| ch=='U')
          v=v+1;
          else
          c=c+1;
        }
        System.out.println("no. of vowels is:"+v+"no.of consonant is"+c);
    }
}
            
