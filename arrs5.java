import java.util.*;
class arrs5
{
    public static void main(String args[])
    {
        String str[]=new String[5];
        String str1="";
        int i=0,v=0,c=0,l=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("enter the string");
            str[i]=sc.nextLine();
        }
        for(i=0;i<5;i++)
        {
            str1=str[i];
            v=0;
            c=0;
            for(l=0;l<str1.length();l++)
            {            
            if(str1.charAt(l)=='a'||str1.charAt(l)=='A'||str1.charAt(l)=='e'
                   ||str1.charAt(l)=='E'||str1.charAt(l)=='o'|| str1.charAt(l)=='O'
                   ||str1.charAt(l)=='i'||str1.charAt(l)=='I'||str1.charAt(l)=='u'
                   ||str1.charAt(l)=='U')
             v=v+1;
             else
             c=c+1;
            }
           System.out.println("no of string   "+str1+"      no.of vowel   "+v+"  no. of consonant  "+c); 
        }
    } 
}          
