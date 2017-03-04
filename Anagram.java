import java.io.*;
import java.util.*;

public class Anagram {

	static void isAnagram(String src){
		String temp = src;
		String first = temp.substring(0,temp.length()/2);
		String second = temp.substring(temp.length()/2);
		char farray[] = first.toCharArray();
		char sarray[] = second.toCharArray();
		int count = 0;
		for (int i = 0;i<first.length();i++){
			for(int j = 0; j < second.length();j++){
				if((sarray[i] == farray[j]) && (farray[j] != '@') && (sarray[i] != '@')) {
					count++;
					farray[j] =sarray[i] = '@';
				}  
			}
		}
		System.out.println(first.length() - count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++){
			String src = sc.next();
			if (src.length()%2 !=0 ) System.out.println(-1);
			else isAnagram(src);
		}  
	}
}
