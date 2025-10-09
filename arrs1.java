import java.util.*;
class arrs1
{
    public static void main(String args[])
    {
        String str[]=new String[5];
        int i=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("enter the string");
            str[i]=sc.nextLine();
        }
        for(i=0;i<5;i++)
        {
            System.out.println(str[i]);
        }
    }        
}            
        