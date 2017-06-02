import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int minSteps(int n, String B){
		if(B.contains("010"))
		{
			String news = B.replace("010","");
			return (B.length() - news.length())/3;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		int result = minSteps(n, B);
		System.out.println(result);
	}
}

