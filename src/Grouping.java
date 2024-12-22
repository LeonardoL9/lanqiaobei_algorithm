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
		int max=arr[n-1]-arr[0],res=0,l=0,r=max;  //用二分查找
		for(res=0;res<max;res++) {
			int count=1,i=0;
			while(i<n-1) {
				int j;
				for(j=i+1;j<n;j++) {
					if(arr[j]-arr[i]>res) {
						count++;
						break;
					}
				}
				i=j;
			}
			if(count==k)break;
		}
		System.out.println(res);
		
	}
}
