import java.util.*;
class arrs2
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
            l=str1.length()-1;
            
            if((str1.charAt(0)=='a'||str1.charAt(0)=='A'||str1.charAt(0)=='e'
                   ||str1.charAt(0)=='E'||str1.charAt(0)=='o'|| str1.charAt(0)=='O'
                   ||str1.charAt(0)=='i'||str1.charAt(0)=='I'||str1.charAt(0)=='u'
                   ||str1.charAt(0)=='U')&&(str1.charAt(l)=='a'||str1.charAt(l)=='A'||str1.charAt(l)=='e'
                   ||str1.charAt(l)=='E'||str1.charAt(l)=='o'|| str1.charAt(l)=='O'
                   ||str1.charAt(l)=='i'||str1.charAt(l)=='I'||str1.charAt(l)=='u'
                   ||str1.charAt(l)=='U'))
             System.out.println(str1);
            }
        }
    } 
             