import java.io.*;
import java.util.*;

public class Gemstones {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int size = 0;
		in.nextLine();
		String[] array = new String[100];
		for(int i = 0; i < n ; i++){
			array[i] = in.nextLine();
		}
		for(int i = 0;i < n-1; i++){
			String first = array[i];
			String second = array[i+1];         
			Set<Character> fs = new HashSet<Character>();
			Set<Character> ss = new HashSet<Character>();   
			for(char ch : first.toCharArray()){
				fs.add(ch);
			}
			for(char ch : second.toCharArray()){
				ss.add(ch);
			}
			ss.retainAll(fs);
			String temp = ss.toString()
				.replace(",","")
				.replace("[","")
				.replace("]","")
				.replaceAll("\\s+","");

			array[i+1] = temp;
			size = temp.length();
		}
		System.out.println(size);
	}
}
