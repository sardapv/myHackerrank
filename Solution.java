import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] hash = new int[255];
		String s  =in.next();
		for(int i=0; i<n; i++){
			hash[s.charAt(i)]++;
		}
		long ans=-1;
		for(int i=0; i<255; i++){
parent:
			for(int j=i+1; j<255; j++){
				StringBuilder sb = new StringBuilder();
				boolean f1=false, f2=false;
				for(int k=0; k<s.length(); k++){
					if ((int)s.charAt(k)==i){
						sb.append(s.charAt(k));
						f1=true;
					} else if ((int)s.charAt(k)==j){
						sb.append(s.charAt(k));
						f2=true;
					}
				}
				if (f1&&f2){

				} else{
					continue;
				}
				String here=sb.toString();
				for(int k=1; k<here.length(); k++){
					if (here.charAt(k)==here.charAt(k-1)){
						continue parent;
					}
				}
				ans=Math.max(ans, here.length());
			}
		}
		System.out.println(ans==-1?0: ans);
	}
}
