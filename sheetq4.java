import java.util.*;
class sheetq4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="",str1="";
        char ch,ch1,ch2;
        int i=0,t=0,l=0,v=0;
        System.out.println("enter the string");
        str=sc.nextLine(); 
        for(i=0;i<str.length();i++)
        {
         ch=str.charAt(i);
                 if(ch==' ')
                 {
                  l=str1.length()-1;
                  ch1=str1.charAt(l);
                  ch2=str1.charAt(0);
                       if((ch1=='a'||ch1=='A'||ch1=='e'||ch1=='E'||ch1=='i'||ch1=='I'||ch1=='o'||ch1=='O'||ch1=='u'||ch1=='U')
                       &&(ch2=='a'||ch2=='A'||ch2=='e'||ch2=='E'||ch2=='i'||ch2=='I'||ch2=='o'||ch2=='u'||ch2=='U'))
                       {
                         System.out.println(str1);    
                       }
                       else
                         System.out.println("non output:"+str1);
                  str1="";
     
                 }
                 else
                {
                  str1=str1+ch;
                }
        }
        l=str1.length()-1;
                  ch1=str1.charAt(l);
                  ch2=str1.charAt(0);
                       if((ch1=='a'||ch1=='A'||ch1=='e'||ch1=='E'||ch1=='i'||ch1=='I'||ch1=='o'||ch1=='O'||ch1=='u'||ch1=='U')
                       &&(ch2=='a'||ch2=='A'||ch2=='e'||ch2=='E'||ch2=='i'||ch2=='I'||ch2=='o'||ch2=='u'||ch2=='U'))
                       {
                         System.out.println(str1);    
                         str1="";
                       }
    }
}    