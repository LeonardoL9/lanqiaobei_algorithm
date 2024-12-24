package lanqiaozhenti;
import java.util.*;
public class InterstellarTourism {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),m=scan.nextInt(),q=scan.nextInt();
		int[][] map=new int[n+1][n+1];
    for(int i=1;i<=n;i++) Arrays.fill(map[i],30000 );
    for(int i=1;i<=n;i++) map[i][i]=0;
		while(m-->0) {
			int a=scan.nextInt(),b=scan.nextInt();
			map[a][b]=map[b][a]=1;
		}
		map=floyd(map,n);
		double sum=0;
		for(int i=0;i<q;i++) {
			int x=scan.nextInt(),y=scan.nextInt();
			int count=0;
			for(int j=1;j<n;j++) if(map[x][j]<=y) count++;
			sum+=count;
			
		}
		System.out.printf("%.2f",sum/q);
		
	}

	private static int[][] floyd(int[][] map,int n) {
		// TODO 返回所能到达星球的个数
		for(int k=1;k<=n;k++) 
			for(int i=1;i<=n;i++) 
				for(int j=1;j<=n;j++) 
					map[i][j]=Math.min(map[i][j], map[i][k]+map[k][j]);
		return map;
	}
}
