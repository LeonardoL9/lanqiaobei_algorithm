package trainning;
import java.util.*;
public class ThreeCoin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=scan.nextInt();
		Set<Integer> s=new HashSet();
		for(int i=0;i<n;i++) {
			s.add(arr[i]);
			for(int j=0;j<n;j++) {
				if(j==i) continue;
				s.add(arr[i]+arr[j]);
				for(int k=0;k<n;k++) {
					if(k==i||k==j) continue;
					s.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		System.out.println(s.size()+1);	
	}

}
