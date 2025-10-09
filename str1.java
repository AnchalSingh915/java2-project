import java.util.*;
class str1
{
    public static void main(String args[])
    {
        String str;
        int v=0,c=0,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        str=sc.nextLine();  
        for(v=0;v<str.length();v++)
        {
            if(str.charAt(v)=='a'||str.charAt(v)=='A'||str.charAt(v)=='e'
                   ||str.charAt(v)=='E'||str.charAt(v)=='o'|| str.charAt(v)=='O'
                   ||str.charAt(v)=='i'||str.charAt(v)=='I'||str.charAt(v)=='u'
                   ||str.charAt(v)=='U')
            t=t+1;
            else
            c=c+1;
        }     
        System.out.println("no.of vowels"+t+"no. of consonant"+c);
    }
}
             
