import java.io.*;
import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		String input = in.nextLine();
		input = input.toLowerCase();
		for(char ch = 'a'; ch <= 'z'; ch++){
			if(input.contains(String.valueOf(ch))){
				flag = true;
				continue;
			}
			else{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("pangram");
		else
			System.out.println("not pangram");


	}
}
