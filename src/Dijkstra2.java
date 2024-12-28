package trainning;
import java.util.*;
public class Dijkstra2 {
	static class Edge{
		int to;
		int cost;
		public Edge(int to,int cost) {
			this.to=to;
			this.cost=cost;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),m=scan.nextInt();
		List<Edge>[] g=new ArrayList[n+1];
	
		for(int i=1;i<=n;i++) {
			g[i]=new ArrayList<>();
		}
		while(m-->0) {
			int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
			g[a].add(new Edge(b,c));
		}
		
		int[] dist=new int[n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[1]=0;
		
		PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
		pq.add(new int[] {1,0});
		while(!pq.isEmpty()) {
			int[] q=pq.poll();
			int i=q[0];
			for(Edge edge:g[i]) {
				if(dist[edge.to]>edge.cost+q[1]) {
					dist[edge.to]=edge.cost+q[1];
					pq.add(new int[] {edge.to,dist[edge.to]});
		
				}
			}
			
		}
		System.out.println(dist[n]>Integer.MAX_VALUE?-1:dist[n]);
	}
}