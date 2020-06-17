public class F5{
public static void main(String args[])
{
char c=args[0].charAt(0);
 if((c>=65 && c<=90) ||(c>=97 &&c<=122))
 {
  System.out.println("Alphabet");
 }
else if(c>=46 && c<=57)
{
System.out.println("Digits");
}
else 
{
System.out.println("Special Characters");
}
}
}