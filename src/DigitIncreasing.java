package trainning;
import java.util.*;
public class DigitIncreasing {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			String t=String.valueOf(i);
			int flag=1;
			for(int j=0;j<t.length()-1;j++) {
				if(t.charAt(j+1)<t.charAt(j)) {
					flag=0;
					break;
				}
			}
			if(flag==1) count++;
		}
		System.out.println(count);
		scan.close();
	}

}
