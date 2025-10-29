 import java.util.*;
class str9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=" ";
        char ch;
        int i=0,v=0,c=0,n=0,s=0;
        System.out.println("enter the string");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
          ch=str.charAt(i);
          if(ch>=48 && ch<=57)
          n=n+1;
          else if((ch>=65 && ch<=90 || ch>=97 && ch<=122)&&(ch=='a'|| ch=='A'||ch=='e'|| ch=='E'||ch=='i'|| ch=='I'||ch=='o'|| ch=='O'||ch=='u'|| ch=='U'))
          v=v+1;
          else if((ch>=65 && ch<=90 || ch>=97 && ch<=122)&&(ch!='a'|| ch!='A'||ch!='e'|| ch!='E'||ch!='i'|| ch!='I'||ch!='O'|| ch!='O'||ch!='u'|| ch!='U'))
          c=c+1;
          else
          s=s+1;
        }
        System.out.println("no. of digits"+n+"no. of vowels is:"+v+"no.of consonant is"+c+"no. of special symbols"+s);
    }
}
            
