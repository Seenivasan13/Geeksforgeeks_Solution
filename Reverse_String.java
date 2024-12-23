import java.util.*;
public class Reverse_String {
    static String reverseString(String s)
    {
        String store="";
        for(int i=s.length()-1;i>=0;i--)
        {
           store=store+s.charAt(i);
        }
        return store;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverseString(s));
    }
}
