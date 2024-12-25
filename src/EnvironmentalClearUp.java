package trainning;
import java.util.*;
public class EnvironmentalClearUp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),q=scan.nextInt();
		int[][] map=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				map[i][j]=scan.nextInt();
		
		int p=getPByfloyd(map,n);
		if(p<=q) {
			System.out.println(0);
			return;
		}
		
		int[][] L=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				L[i][j]=scan.nextInt();
		
		if(getPByfloyd(L,n)>q){
			System.out.println(-1);
		}
		//使用二分查找day
		int l=1,r=Integer.MAX_VALUE,day=r;
		while(l<=r) {
			int mid=(l+r)/2;
			//更新map 并获取最短路径灰度值
			int t=getPByfloyd(updateMap(map,L,mid,n),n);
			if(t<=q) {
				day=mid;
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		System.out.println(day);
		scan.close();
	}

	private static int[][] updateMap(int[][] m, int[][] L, int day,int n) {
		int[][] map=new int[n][n];
		for(int i=0;i<n;i++)
			map[i]=Arrays.copyOf(m[i], n);
		// TODO 更新map
		int x=day/n,y=day%n-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<=y) map[i][j]=Math.max(map[i][j]-x-1, L[i][j]);
				else map[i][j]=Math.max(map[i][j]-x, L[i][j]);
				map[j][i]=map[i][j];  //清扫本城市后也要更改相反线路城市的灰度
			}
		}
		return map;
	}

	private static int getPByfloyd(int[][] m, int n) {
		int[][] map=new int[n][n];
		for(int i=0;i<n;i++)
			map[i]=Arrays.copyOf(m[i], n);
		// TODO 
		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					map[i][j]=Math.min(map[i][j], map[i][k]+map[k][j]);
		int sum=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				sum+=map[i][j];
		return sum;
	}
}
