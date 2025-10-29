import java.util.*;
class str4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=" ";
        char ch,ch1,ch2;
        int i=0,l=0,x=0;
        System.out.println("enter the string");
        str=sc.nextLine();
        for(x=65;x<=90;x++)
        {
            ch=(char)x;
            ch2=(char)(x+32);
            l=0;
             for(i=0;i<str.length();i++)
             {
                 ch1=str.charAt(i);
                 if(ch==ch1||ch2==ch1)
                 
                 l=l+1;
             }
             if(l>0)
             System.out.println("character is :"+ch+"no.of occurence is :"+l);
        }
    }
}
          
            
