import java.io.*;
import java.util.*;

public class CaesarCipher{
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		String input = in.next();
		int nextvalue = 0;
		int temp = 0;
		char array[] = input.toCharArray();
		int rotator =  in.nextInt();
		for (int i=0; i < length; i++) {
			if (array[i] >= 'a' && array[i] <= 'z') {
				int currDiff = (int)array[i] - (int)'a';
				int newPos = (int)'a' + ((rotator + currDiff) % 26);
				array[i] = (char)newPos;
			}
			else if (array[i] >= 'A' && array[i] <= 'Z') {
				int currDiff = (int)array[i] - (int)'A';
				int newPos = (int)'A' + ((rotator + currDiff) % 26);
				array[i] = (char)newPos;
			}
		}
		System.out.println(array);
	}
}
