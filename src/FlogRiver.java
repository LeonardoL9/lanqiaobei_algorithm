package trainning;
import java.util.*;
public class FlogRiver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),x=scan.nextInt();
		int[] arr=new int[n+1];
		for(int i=1;i<n;i++) {
			arr[i]=scan.nextInt()+arr[i-1];
		}
		arr[n]=arr[n-1]+1000000000;
		int l=0,sum=0;
		for(int i=1;i<=n;i++) {
			if(arr[i]-arr[l]>=2*x) {
				sum=Math.max(sum, i-l);
				l+=1;
			}
		}
		System.out.println(sum);
		scan.close();
	}
}
