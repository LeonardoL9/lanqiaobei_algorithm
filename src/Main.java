package lanqiaozhenti;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//第15届第二题

public class Main {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int max=197;
     for (int j = 197; j < 1e7; j++) {
		//在此输入您的代码...
		int N = j;
		String sn = String.valueOf(N);
		int n = sn.length(), k = n-1;
		long[] s=new long[65];
		
		for (int i = 0; i < n; i++) {
			s[i] = sn.charAt(i) - '0';
		}
		while (s[k] < N) {
			k++;
			s = f(s, n, k);
		}
		if (s[k] == N) {
			max=j;
		} 
	}
    System.out.println(max);
	scan.close();
 }

 public static long[] f(long[] s,int n,int k){
   for(int i=k-n;i<=k-1;i++){
     s[k]+=s[i];
   }
   return s;
 }
}
