package trainning;
import java.util.*;
public class Dijkstra1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(); 
        int[][] g = new int[n + 1][n + 1]; 
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); 
            if (g[a][b] == 0) g[a][b] = c;  
            else g[a][b] = Math.min(g[a][b], c);  
        }

        int[] dist = new int[n + 1]; 
        Arrays.fill(dist, Integer.MAX_VALUE / 2); 
        dist[1] = 0; 
        
        // 使用优先队列进行Dijkstra算法
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1],b[1]));
        pq.offer(new int[]{1, 0}); 

        // Dijkstra算法主循环
        while (!pq.isEmpty()) {
            int[] p = pq.poll(); 
            int i = p[0]; // 当前节点

            // 遍历所有与当前节点相邻的节点
            for (int j = 1; j <= n; j++) {
                if (g[i][j] != 0 && dist[j] > p[1] + g[i][j]) {
                    dist[j] = p[1] + g[i][j]; 
                    pq.offer(new int[]{j, dist[j]}); 
                }
            }
        }
        System.out.println(dist[n] >= Integer.MAX_VALUE / 2 ? -1 : dist[n]);
    }
}
