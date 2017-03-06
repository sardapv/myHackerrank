import java.io.*;
import java.util.*;

public class FunnyString{

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in  = new Scanner(System.in);
		int num = in.nextInt();
		in.nextLine();
		String input = null;
		for (int k = 0; k < num; k++){
			input = in.nextLine();
			func(input);
		}
	}
	public static void func(String input){
		boolean flag  = true;

		for ( int i = 0 ; i < input.length()/2; i++){
			int j =input.length() - i -1;
			int temp = Math.abs((int)input.charAt(i+1) - (int)input.charAt(i));
			int newl = Math.abs((int)input.charAt(j-1) - (int)input.charAt(j));
			if(temp != newl){
				flag = false;
				break;}
		}
		if(flag)
			System.out.println("Funny");
		else
			System.out.println("Not Funny");      
	}
}

