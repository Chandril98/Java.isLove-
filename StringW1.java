import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

public class StringW1{

    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String : ");
        String  s =  sc.nextLine();
        System.out.println("Enter the Endletter you want to search:");
        String n = sc.nextLine();
        System.out.println("Words end with " + n +" is: ");

        s=s+' ';
        int i, pos;
        String w;
        for(pos=0, i = 0 ; i<s.length();i++)
        {
            if ((s.charAt(i)==' ') && (s.charAt(i-1)==n.charAt(0)))
            {
                    w =s.substring(pos,i);
                    System.out.println(w);
                    pos=i+1;
                    System.out.println();
            }
            else{
                if (s.charAt(i)==' ')
                {
                    pos=i+1;
                }
            }
        }
    }
}