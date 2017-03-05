import java.io.*;
import java.util.*;

public class CamelCase{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		boolean flag = true;
		int count = 0;
		char input[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++){
			if((input[i] >= 65) && (input[i] <= 90)){
				count++;
				if(i == 0)
					flag  =  false;
			}     
		}
		if (flag)
			System.out.println(count+1);
		else
			System.out.println("Not a camelcase");
	}
}

