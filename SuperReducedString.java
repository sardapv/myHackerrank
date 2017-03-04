import java.io.*;
import java.util.*;

public class SuperReducedString {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		char inp[] = input.toCharArray();
		int len =  inp.length;
		for(int i = 0; i < (inp.length-1); i++){
			if(inp[i] == inp[i+1]){
				if(i-1 < 0){
					if(input.length()>2)
						input = input.substring(i+2,inp.length);
					else{
						System.out.println("Empty String");
						System.exit(1);}
				}
				else if(i+2 > input.length()){
					input = input.substring(0,inp.length-2);               
				}
				else {
					String firsthalf = input.substring(0,i);
					String secondhalf = input.substring(i+2,inp.length);
					input = firsthalf + secondhalf;
				}
				i = -1;
				inp = null;
				inp = input.toCharArray();
			}
			else if (input == null){
				System.out.println("Empty String");
			}
		}
		System.out.print(input);
	}
}
