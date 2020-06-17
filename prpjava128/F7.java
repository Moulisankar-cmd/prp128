import java.util.*;
public class F7.java{
public static void main(String args[]){
	char ch=args[0].charAt(0);
	String ab=Character.toString(ch);
	if(ch>=65 && ch<=90)
		{
			 ab=ab.toLowerCase();
			System.out.println(ch+"->"+ab);
		}
	else if(ch>=97&& ch<=122)
		{
			ab=ab.toUpperCase();
			System.out.println(ch+"->"+ab);
		}
	
	}
}
		