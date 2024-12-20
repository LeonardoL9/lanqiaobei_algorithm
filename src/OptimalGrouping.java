package lanqiaozhenti;
import java.util.*;
public class OptimalGrouping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double p=scan.nextDouble();
		double min=Double.MAX_VALUE;
		int res=0;
		for(int k=1;k<=n;k++) {
			double count=n/k+n-n*Math.pow(1-p, k);
			if(count<min) {
				min=count;
				res=k;
			}
		}
		System.out.println(res);	
	}
}
