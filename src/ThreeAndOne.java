import java.util.Scanner;
import java.util.Arrays;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class ThreeAndOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            String str=scan.next();
            char[] s=str.toCharArray();
            Arrays.sort(s);
            if(s[0]!=s[3]&&s[0]==s[2]){
                System.out.println("Yes");
            }else if(s[0]!=s[3]&&s[1]==s[3]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        scan.close();
    }
}