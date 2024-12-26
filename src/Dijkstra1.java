package trainning;
import java.util.*;
public class Dijkstra1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),m=scan.nextInt();
		int[][] map=new int[n+1][n+1];
		for(int i=1;i<=n;i++) Arrays.fill(map[i], 10010);
		while(m-->0) {
			int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
			map[a][b]=c;
		}
	
		int ans=Dijkstra(map,1,n);
		System.out.println(ans);
		scan.close();	
	}

	private static int Dijkstra(int[][] map, int start, int end) {
		// TODO Auto-generated method stub
		int n=map[0].length-1;
		for(int k=1;k<=n;k++) 
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					map[i][j]=Math.min(map[i][j], map[i][k]+map[k][j]);
		return map[start][end];
	}
}
