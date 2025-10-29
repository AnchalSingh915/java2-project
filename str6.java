 import java.util.*;
class str6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=" ";
        char ch,ch1,ch2;
        int i=0,va=0,ve=0,vi=0,vo=0,vu=0;
        System.out.println("enter the string");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
          ch=str.charAt(i);
          if(ch=='a'|| ch=='A')
          va++;
          if(ch=='e'|| ch=='E')
          ve++;
          if(ch=='i'|| ch=='I')
          vi++;
          if(ch=='o'|| ch=='O')
          vo++;
          if(ch=='u'|| ch=='U')
          vu++;
        }  
         System.out.println("no of A/a is"+va+"no of e/E is"+ve+"no of i/I is"+vi+"no of o/O is"+vo+"no of U/u is"+vu);
        }
    }
            
