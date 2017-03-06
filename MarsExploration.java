import java.util.*;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		String S = in.next();
		for(int i = 0; i < S.length(); i = i+3){
			if(S.charAt(i) != 'S')
				count++;
			if(S.charAt(i+1) != 'O')
				count++;
			if(S.charAt(i+2) != 'S')
				count++;
		}
		System.out.println(count);
	}
}

