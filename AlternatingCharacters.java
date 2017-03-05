import java.io.*;
import java.util.*;

public class AlternatingCharacters {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] input = new String[100];
		for(int j = 0; j < n ; j++){
			String line = in.nextLine();
			int count = 0;
			for(int i = 0; i < line.length()-1;i++){
				if(line.charAt(i) == line.charAt(i+1)){
					count++;
				}
			}
			System.out.println(count);
		}       
	}
}
