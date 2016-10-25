import java.util.Scanner;

public class iterativeSubstring{

  public static Scanner kb = new Scanner(System.in);

  public static void main(String[] args)
  {
  	System.out.println("What word do you want to check for palindrome-ness?  ");

  	String pal = kb.nextLine();

  	if (checkPal(pal))
  		System.out.println("Yeah, that's a palindrome.");
  	else
  		System.out.println("Nah, that ain't no palindrome.");

  }
  
 /**
  *   This method tests for palindrome-ness using recursion and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */

    public static boolean checkPal(String s)
  {

  	int count = 0;

    while (count <= s.length() - 1)
    {
    	if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length())) == false)
    		return false;

    	else
    		s = s.substring(1, s.length() - 1);
    	count ++;
    }
    return true;
  }
  
}
