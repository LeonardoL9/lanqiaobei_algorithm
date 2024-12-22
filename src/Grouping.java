package day01;
import java.util.*;
public class Grouping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),k=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		if(k==1) {
			System.out.println(arr[n-1]-arr[0]);
		}
		int max=arr[n-1]-arr[0],l=0,r=max,res=max;  //用二分查找
		while(l<=r) {
			int mid=(l+r)/2;
			int count=1,i=0;
			for(int j=i+1;j<n;j++) {
				if(arr[j]-arr[i]>mid) {
					count++;
					i=j;
				}
			}
			if(count<=k) {
				res=mid;
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		System.out.println(res);
	}
}
